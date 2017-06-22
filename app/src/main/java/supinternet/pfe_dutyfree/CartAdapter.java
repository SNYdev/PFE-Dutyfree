package supinternet.pfe_dutyfree;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;

import java.util.List;


public class CartAdapter extends ArrayAdapter<Cart> {

    //tweets est la liste des models à afficher
    public CartAdapter(Context context, List<Cart> cart) {
        super(context, 0, cart);
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_cart,parent, false);
        }

        CartViewHolder viewHolder = (CartViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new CartViewHolder();
            viewHolder.productName = (TextView) convertView.findViewById(R.id.productName);
            viewHolder.price = (TextView) convertView.findViewById(R.id.price);
            viewHolder.quantity = (NumberPicker) convertView.findViewById(R.id.quantity);
            viewHolder.quantity.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
            viewHolder.quantity.setMinValue(0);
            viewHolder.quantity.setMaxValue(20);
            viewHolder.quantity.setWrapSelectorWheel(false);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Cart cartItem = getItem(position);
        //il ne reste plus qu'à remplir notre vue
        viewHolder.productName.setText(cartItem.getProductName());
        Float price = Float.parseFloat(cartItem.getOriginalPrice()) * (float)cartItem.getQuantity();
        String priceString = String.valueOf(price);
        cartItem.setPrice(priceString);
        viewHolder.price.setText(cartItem.getPrice()+"€");
        viewHolder.quantity.setValue(cartItem.getQuantity());

        LayoutInflater inflator=LayoutInflater.from(getContext());
        final TextView oPrice = viewHolder.price;
        /*viewHolder.quantity.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal){
                Cart cart = getItem(position);
                cart.setQuantity(newVal);
                Float newPrice = Float.parseFloat(cart.getOriginalPrice()) * (float)newVal;
                String newPriceString = String.valueOf(newPrice);
                cart.setPrice(newPriceString);
            }
        });*/

        viewHolder.quantity.setOnScrollListener(new NumberPicker.OnScrollListener() {

            @Override
            public void onScrollStateChange(NumberPicker numberPicker, int scrollState) {
                if (scrollState == NumberPicker.OnScrollListener.SCROLL_STATE_IDLE) {
                    Cart cartItem = getItem(position);
                    //total -= Float.parseFloat(cart.getPrice());
                    cartItem.setQuantity(numberPicker.getValue());
                    Float newPrice = Float.parseFloat(cartItem.getOriginalPrice()) * (float)numberPicker.getValue();
                    String newPriceString = String.valueOf(newPrice);
                    cartItem.setPrice(newPriceString);
                    oPrice.setText(cartItem.getPrice()+"€");
                }
            }
        });
        return convertView;
    }

    private class CartViewHolder{
        public ImageView color;
        public TextView productName;
        public TextView price;
        public NumberPicker quantity;
    }
}
