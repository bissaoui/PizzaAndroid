package ma.emsi.pizza.classes;

import java.io.Serializable;

public class Produit implements Serializable {
    private int id,nbrIngredients,photo;
    private String nom,detaisIngred,description,preparation;
    private String duree ;
    public static int cmp=0;
    public Produit(){
        id=++cmp;
    }

    public Produit( String nom , int nbrIngredients, int photo ,String duree  ,String detaisIngred ,String description , String preparation ) {
        id=++cmp;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.nom = nom;
        this.detaisIngred = detaisIngred;
        this.description = description;
        this.preparation = preparation;
        this.duree = duree;
    }

    public Produit( String nom , int photo ,String duree  ) {
        id=++cmp;
        this.photo = photo;
        this.nom = nom;
        this.duree = duree;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDetaisIngred() {
        return detaisIngred;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", nom='" + nom + '\'' +
                ", detaisIngred='" + detaisIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                ", duree=" + duree +
                '}';
    }
}
