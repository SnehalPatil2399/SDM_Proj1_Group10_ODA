public class patient{
    private int patid,patient_number;
    private String pname,pataddress,patdesc,patemail;

    public patient(int patid,String pname,String pataddress,int patient_number,String pdesc,String patemail){
        this.patid=patid;
        this.pname=pname;
        this.pataddress=pataddress;
        this.patient_number=patient_number;
        this.patdesc=pdesc;
        this.patemail=patemail;
    }

    public void setPatid(int pid){
        this.patid=pid;
    }

    public int getPid(){
        return this.patid;
    }

    public void setPataddress(String paddress){
        this.pataddress=paddress;
    }

    public String getPataddress(){
        return this.pataddress;
    }

    public void setPname(String pname){
        this.pname=pname;
    }

    public String getPname(){
        return this.pname;
    }

    public void setPnumber(int pnumber){
        this.patient_number=pnumber;
    }

    public int getPnumber(){
        return this.patient_number;
    }

    public void setPdesc(String pdesc){
        this.patdesc=pdesc;
    }

    public String getPdesc(){
        return this.patdesc;
    }

    public void setPemail(String pemail){
        this.patemail=pemail;
    }

    public String getPemail(){
        return this.patemail;
    }
}