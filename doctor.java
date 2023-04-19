public class doctor {
    
    private int drId;
    private float rating;
    private String drEmail, specialization, dname;

    public doctor(int drId, float rating,String drEmail, String specialization, String dname){

        this.drId = drId;
        this.rating = rating;
        this.drEmail = drEmail;
        this.specialization = specialization;
        this.dname = dname;
    }
    // GS DrId
    public void setDrid( int drId){
        this.drId = drId;
    }

    public  int getDrid(){
        return this.drId;
    }

    //Gs rating
    public void setRating( float rating){
        this.rating = rating;
    }

    public  float getRating(){
        return this.rating;
    }
    //Gs dremail

    public void setDrEmail( String drEmail){
        this.drEmail = drEmail;
    }

    public  String getDrEmail(){
        return this.drEmail;
    }
    // GS specialization

    public void setSpecialization( String specialization){
        this.specialization = specialization;
    }

    public  String getSpecialization(){
        return this.specialization;
    }

    //GS Dname

    public void setDname( String dname){
        this.dname = dname;
    }

    public  String getDname(){
        return this.dname;

    @Override
    public String toString(){

        return drId+ " " +dname+ " "+ specialization + " "+ drEmail+ " "+ rating;
    }

}

