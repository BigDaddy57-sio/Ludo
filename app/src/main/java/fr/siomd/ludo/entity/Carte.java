package fr.siomd.ludo.entity;

public class Carte {

    private String figure;
    private String couleur;

    /**
     * @return couleur
     */
    public String getCouleur(){
        return couleur;
    }

    /**
     * @return figure
     */
    public String getFigure(){
        return figure;
    }

    /**
     * @param pCouleur
     * @param pFigure
     */
    public Carte(String pCouleur, String pFigure){
        couleur = pCouleur;
        figure = pFigure;
    }


    /**
     * @return
     */
    public int getValeur()  {
        int laValeur;
        switch (figure) {
            case "As": laValeur = 14; break;
            case "Roi": laValeur = 13; break;
            case "Dame": laValeur = 12; break;
            case "Valet": laValeur = 11; break;
            default: laValeur = Integer.parseInt(figure); break;
        }
        return laValeur;
    }

    /**
     * @return
     */
    public String getNom() {
        return String.format("%s de %s", getFigure(), getCouleur());
    }

    /**
     * @return
     */
    public String getNomImg() {
        String nomCarte;
        switch (getCouleur()) {
            case "Carreau":
                nomCarte = "ca" + getValeur();
                break;
            case "Coeur":
                nomCarte = "co" + getValeur();
                break;
            case "Pique":
                nomCarte = "p" + getValeur();
                break;
            case "Trèfle":
                nomCarte = "t" + getValeur();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + getCouleur());
        }
        return nomCarte;
    }

    /**
     * @param pCouleur
     *
     */
    public boolean isAtout(String pCouleur){
        return (couleur.equals(pCouleur));
    }
}
