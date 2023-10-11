public class Invoice {
    private String model;
    private String descriere;
    private int cant;
    private double pret;

    public Invoice(String model, String descriere, int cant, double pret){
        this.model = model;
        this.descriere = descriere;
        this.cant = cant;
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getAmount(int cant, double pret){
        if (cant<0){
            return 0;
        } else if (pret<0.0){
            return 0.0;
        } else {
            return cant*pret;
        }
    }
}
