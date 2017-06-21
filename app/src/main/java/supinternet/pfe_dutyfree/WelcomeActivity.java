package supinternet.pfe_dutyfree;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.zxing.common.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        String destination = "";
        String departure = "";
        Boolean ok = false;
        Boolean france = false;
        String welcomeMsg = "";
        Map<String, String> airportMap = new HashMap<String, String>();

        airportMap.put("Agen", "Aéroport Agen-La Garenne AGF");
        airportMap.put("Aix", "Aérodrome d’Aix – Les Milles QXB");
        airportMap.put("Ajaccio", "Aéroport d’Ajaccio Napoléon Bonaparte AJA");
        airportMap.put("Albi", "Aérodrome d’Albi – Le Séquestre LBI");
        airportMap.put("Amiens", "Aéroport d’Amiens – Glisy QAM");
        airportMap.put("Angers", "Angers Loire Aéroport ANE");
        airportMap.put("Angoulême", "Aéroport international Angoulême-Cognac ANG");
        airportMap.put("Annecy", "Aéroport d’Annecy Haute-Savoie Mont-Blanc NCY");
        airportMap.put("Annemasse", "Aérodrome d’Annemasse QNJ");
        airportMap.put("Arcachon", "Aérodrome d’Arcachon – La Teste-de-Buch XAC");
        airportMap.put("Arras", "Aérodrome d’Arras – Roclincourt QRV");
        airportMap.put("Aubenas", "Aérodrome d’Aubenas Ardèche méridionale OBS");
        airportMap.put("Aurillac", "Aéroport d’Aurillac AUR");
        airportMap.put("Auxerre", "Aéroport d’Auxerre – Branches AUF");
        airportMap.put("Avignon", "Aéroport d’Avignon – Caumont AVN");
        airportMap.put("Bâle", "Aéroport de Bâle-Mulhouse-Fribourg EAP/BSL/MLH");
        airportMap.put("Barcelonnette", "Aérodrome de Barcelonnette – Saint-Pons BAE");
        airportMap.put("Bastia", "Aéroport de Bastia Poretta BIA");
        airportMap.put("Beauvais", "Aéroport de Beauvais-Tillé BVA");
        airportMap.put("Bergerac", "Aéroport Bergerac Dordogne Périgord EGC");
        airportMap.put("Besançon", "Aérodrome de Besançon – La Vèze QBQ");
        airportMap.put("Béziers", "Aéroport de Béziers-Cap d’Agde BZR");
        airportMap.put("Biarritz", "Aéroport de Biarritz Pays Basque BIQ");
        airportMap.put("Bordeaux", "Aéroport de Bordeaux – Mérignac BOD");
        airportMap.put("Bourges", "Aéroport de Bourges BOU");
        airportMap.put("Brest", "Aéroport de Brest-Bretagne BES");
        airportMap.put("Brive", "Aéroport de Brive-Souillac BVE");
        airportMap.put("Cahors", "Aérodrome de Cahors – Lalbenque ZAO");
        airportMap.put("Calais", "Aéroport de Calais – Dunkerque CQF");
        airportMap.put("Calvi", "Aéroport de Calvi-Sainte-Catherine CLY");
        airportMap.put("Cannes", "Aéroport de Cannes – Mandelieu CEQ");
        airportMap.put("Carcassonne", "Aéroport de Carcassonne Salvaza CCF");
        airportMap.put("Castres", "Aéroport de Castres-Mazamet DCM");
        airportMap.put("Chalon", "Aéroport de Chalon – Champforgeuil XCD");
        airportMap.put("Châlons", "Aéroport Châlons Vatry XCR");
        airportMap.put("Chambéry", "Aéroport de Chambéry – Savoie CMF");
        airportMap.put("Châteauroux", "Aéroport de Châteauroux – Déols CHR");
        airportMap.put("Cherbourg", "Aéroport de Cherbourg – Maupertus CER");
        airportMap.put("Cholet", "Aérodrome de Cholet – Le Pontreau CET");
        airportMap.put("Clermont-Ferrand", "Aéroport de Clermont-Ferrand Auvergne CFE");
        airportMap.put("Colmar", "Aéroport de Colmar – Houssen CMR");
        airportMap.put("Dax", "Aérodrome de Dax – Seyresse XDA");
        airportMap.put("Dieppe", "Aérodrome de Dieppe – Saint-Aubin DPE");
        airportMap.put("Dijon", "Aéroport de Dijon-Bourgogne DIJ");
        airportMap.put("Dinard", "Aéroport de Dinard Pleurtuit Saint-Malo DNR");
        airportMap.put("Dole", "Aéroport de Dole-Jura DLE");
        airportMap.put("Epinal", "Aéroport d’Épinal-Mirecourt EPL");
        airportMap.put("Figari", "Aéroport de Figari Sud Corse FSC");
        airportMap.put("Gap", "Aérodrome de Gap – Tallard GAP");
        airportMap.put("Grenoble", "Aéroport International de Grenoble-Isère GNB");
        airportMap.put("L’Ile-d’Yeu", "Aérodrome de L’Île-d’Yeu IDY");
        airportMap.put("La Rochelle", "Aéroport de La Rochelle – île de Ré LRH");
        airportMap.put("La Roche-sur-Yon", "Aérodrome de La Roche-sur-Yon – Les Ajoncs EDM");
        airportMap.put("Lannion", "Aéroport de Lannion LAI");
        airportMap.put("Laval", "Aéroport de Laval – Entrammes LVA");
        airportMap.put("Le Bourget", "Aéroport Paris-Le Bourget LBG");
        airportMap.put("Le Castellet", "Aéroport du Castellet CTT");
        airportMap.put("Le Havre", "Aéroport du Havre-Octeville LEH");
        airportMap.put("Le Mans", "Aéroport Le Mans-Arnage LME");
        airportMap.put("Le Puy", "Aéroport du Puy – Loudes LPY");
        airportMap.put("Le Touquet", "Aéroport du Touquet-Côte d’Opale LTQ");
        airportMap.put("Les Sables-d’Olonne", "Aérodrome des Sables-d’Olonne – Talmont LSO");
        airportMap.put("Lille", "Aéroport de Lille – Lesquin LIL");
        airportMap.put("Limoges", "Aéroport de Limoges-Bellegarde LIG");
        airportMap.put("Lorient", "Aéroport de Lorient Bretagne Sud LRT");
        airportMap.put("Lourdes", "Aéroport de Tarbes-Lourdes-Pyrénées LDE");
        airportMap.put("Lyon", "Aéroport de Lyon-Bron LYN");
        airportMap.put("Lyon", "Aéroport de Lyon-Saint-Exupéry LYS");
        airportMap.put("Marseille", "Aéroport Marseille Provence MRS");
        airportMap.put("Mende", "Aérodrome de Mende – Brenoux MEN");
        airportMap.put("Merville", "Aéroport de Merville – Calonne HZB");
        airportMap.put("Metz", "Aéroport de Metz-Nancy-Lorraine ETZ");
        airportMap.put("Montbéliard", "Aérodrome de Montbéliard – Courcelles XMF");
        airportMap.put("Montluçon", "Aéroport de Montluçon Guéret MCU");
        airportMap.put("Montpellier", "Aéroport de Montpellier-Méditerranée MPL");
        airportMap.put("Mont-Saint-Michel", "Aéroport de Granville-Mont-Saint-Michel GFR");
        airportMap.put("Morlaix", "Aéroport de Morlaix Ploujean MXN");
        airportMap.put("Nancy", "Aéroport de Nancy-Essey ENC");
        airportMap.put("Nantes", "Aéroport Nantes Atlantique NTE");
        airportMap.put("Nevers", "Aéroport de Nevers-Fourchambault NVS");
        airportMap.put("Nice", "Aéroport de Nice-Côte d’Azur NCE");
        airportMap.put("Nîmes", "Aéroport de Nîmes-Garons FNI");
        airportMap.put("Niort", "Aérodrome de Niort – Marais Poitevin NIT");
        airportMap.put("Pau", "Aéroport de Pau-Pyrénées PUF");
        airportMap.put("Périgueux", "Aéroport Périgueux-Bassillac PGX");
        airportMap.put("Perpignan", "Aéroport de Perpignan-Rivesaltes PGF");
        airportMap.put("Poitiers", "Aéroport de Poitiers-Biard PIS");
        airportMap.put("Pontoise", "Aéroport de Pontoise – Cormeilles-en-Vexin POX");
        airportMap.put("Propriano", "Aérodrome de Propriano PRP");
        airportMap.put("Quimper", "Aéroport de Quimper Cornouaille UIP");
        airportMap.put("Rennes", "Aéroport de Rennes – Saint-Jacques RNS");
        airportMap.put("Roanne", "Aéroport de Roanne-Renaison RNE");
        airportMap.put("Rochefort", "Aéroport de Rochefort – Charente-Maritime RCO");
        airportMap.put("Rodez", "Aérodrome de Rodez-Aveyron RDZ");
        airportMap.put("Rouen", "Aéroport Rouen Vallée de Seine URO");
        airportMap.put("Royan", "Aérodrome de Royan – Médis RYN");
        airportMap.put("Saint-Brieuc", "Aéroport de Saint-Brieuc Armor SBK");
        airportMap.put("Saint-Etienne", "Aéroport de Saint-Étienne – Loire EBU");
        airportMap.put("Saint-Nazaire", "Aéroport de Saint-Nazaire – Montoir SNR");
        airportMap.put("Saint-Yan", "Aéroport de Saint-Yan SYT");
        airportMap.put("Solenzara", "Base aérienne de Solenzara SOZ");
        airportMap.put("Strasbourg", "Aéroport de Strasbourg-Entzheim SXB");
        airportMap.put("Toulon", "Aéroport de Toulon-Hyères TLN");
        airportMap.put("Toulouse", "Aéroport Toulouse-Blagnac TLS");
        airportMap.put("Tours", "Aéroport de Tours Val de Loire TUF");
        airportMap.put("Toussus-le-Noble", "Aéroport de Toussus-le-Noble TNF");
        airportMap.put("Troyes", "Aéroport de Troyes – Barberey QYR");
        airportMap.put("Valence", "Aéroport de Valence-Chabeuil VAF");
        airportMap.put("Valenciennes", "Aérodrome de Valenciennes – Denain XVS");
        airportMap.put("Vannes", "Aéroport de Vannes – Meucon VNE");
        airportMap.put("Vichy", "Aéroport de Vichy — Charmeil VHY");

        Intent intent = getIntent();
        String ticketScan = intent.getStringExtra("ticketScan");
        String[] parts = ticketScan.split(" ");
        String[] namePart = parts[0].split("/");
        String name = namePart[1];
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        if (ticketScan.toUpperCase().contains("ORY")) {
            ok = true;
            String[] ticketParts = ticketScan.toUpperCase().split("ORY");
            departure = new StringBuilder().append(ticketParts[0].charAt(ticketParts[0].length()-3)).append(ticketParts[0].charAt(ticketParts[0].length()-2)).append(ticketParts[0].charAt(ticketParts[0].length()-1)).toString();
            destination = new StringBuilder().append(ticketParts[1].charAt(0)).append(ticketParts[1].charAt(1)).append(ticketParts[1].charAt(2)).toString();
        } else if (ticketScan.toUpperCase().contains("CDG")) {
            ok = true;
            String[] ticketParts = ticketScan.toUpperCase().split("CDG");
            departure = new StringBuilder().append(ticketParts[0].charAt(ticketParts[0].length()-3)).append(ticketParts[0].charAt(ticketParts[0].length()-2)).append(ticketParts[0].charAt(ticketParts[0].length()-1)).toString();
            destination = new StringBuilder().append(ticketParts[1].charAt(0)).append(ticketParts[1].charAt(1)).append(ticketParts[1].charAt(2)).toString();
        }

        if (ok) {
            for (Map.Entry<String, String> entry : airportMap.entrySet()) {
                if (entry.getValue().contains(departure) || entry.getValue().contains(destination)) {
                    france = true;
                    Intent franceIntent = new Intent(this, FranceWelcomeActivity.class);
                    String welcomeTxt = getResources().getString(R.string.welcomeMsg);
                    welcomeMsg = String.format(welcomeTxt, name);
                    franceIntent.putExtra("welcomeMsg", welcomeMsg);
                    startActivity(franceIntent);
                }
            }
            if (!france) {
                String welcomeTxt = getResources().getString(R.string.ticketCheckText);
                welcomeMsg = String.format(welcomeTxt, name);
            }
        } else {
            Intent unknownAirportIntent = new Intent(this, UnknownAirportActivity.class);
            String welcomeTxt = getResources().getString(R.string.notOkMsg);
            unknownAirportIntent.putExtra("welcomeMsg", welcomeTxt);
            startActivity(unknownAirportIntent);
        }
        TextView ticketCheckStatus = (TextView) findViewById(R.id.TicketCheckStatus);
        TextView ticketCheck = (TextView) findViewById(R.id.TicketCheck);

        ticketCheckStatus.setText(welcomeMsg);
        ticketCheck.setText(ticketScan);
    }

    public void goToCatalogActivity(View v){
        Intent goToCatalogActivity = new Intent(this, NavigationActivity.class);
        startActivity(goToCatalogActivity);
    }
}
