package ma.emsi.pizza.service;

import java.util.ArrayList;

import ma.emsi.pizza.classes.Produit;
import ma.emsi.pizza.dao.IDao;

public class ProduitService implements IDao <Produit> {

   ArrayList<Produit> produits ;
    public ProduitService() {
        this.produits = new ArrayList<Produit>();
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }
    @Override
    public boolean update(Produit o) {
        for (Produit p : produits){
            if(p.getId()==o.getId()){
                p.setNom(o.getNom());
                p.setDescription(o.getDescription());
                p.setDetaisIngred(o.getDetaisIngred());
                p.setDuree(o.getDuree());
                p.setNbrIngredients(o.getNbrIngredients());
                p.setPhoto(o.getPhoto());
                p.setPreparation(o.getPreparation());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public ArrayList<Produit> findAll() {
        return produits;
    }

    @Override
    public Produit findById(int id) {
        for (Produit p : produits){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }
}
