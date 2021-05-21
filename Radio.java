
package javacurs3;
public class Radio {
    private boolean bPornit= false;
    private int nVolMaxim;
    private int nVolCurent=0;
    private int nPostCurent=0;

    String[] arrPosturi={"Radio Zu","Kiss FM","Europa FM","Magic FM"};
    void postUrmator() {
        if (nPostCurent<arrPosturi.length-1){
            nPostCurent++;
            System.out.println("Am setat postul :"+ arrPosturi[nPostCurent]);
        }
        else {
            nPostCurent=0;
            System.out.println("Am setat postul :"+ arrPosturi[nPostCurent]);
        }
    }
    void postPrecedent() {
        if (nPostCurent>0){
            nPostCurent--;
            System.out.println("Am setat postul :"+ arrPosturi[nPostCurent]);
        }
        else {
            nPostCurent=arrPosturi.length+1;
            System.out.println("Am setat postul :"+ arrPosturi[nPostCurent]);
        }
    }
    void stare(){
        if (bPornit){
            System.out.println("Radio pornit pe postul :"+ arrPosturi[nPostCurent]+ " este pornit la nivel volum "+ nVolCurent);
        }
        else {
            System.out.println("Radio este oprit");
        }
    }
    Radio(int volumMaxim){
        nVolMaxim=volumMaxim;
    }
    void porneste(){
        if(bPornit==false)
        {
            bPornit=true;
            nVolCurent=1;
            System.out.println("Radio a fost pornit");
        }
        else {
            System.out.println("Radio este deja pornit");
        }
    }
    void opreste()
    {
        if (bPornit){
            bPornit=false;
            nVolCurent=0;
            System.out.println("Radio a fost oprit.");
        }
        else
        {
            System.out.println("Radio este deja oprit");
        }
    }
    void daMaiTare() {
        daMaiTare(1);
    }
    void daMaiTare(int nrTrepte) {
        if (bPornit==false){
            System.out.println("Volumul nu se poate seta, radio este oprit");
            return;
        }
        if (nVolCurent+ nrTrepte<nVolMaxim)
        {
            nVolCurent+=nrTrepte;
            System.out.println("Volumul a fost setat la:"+ nVolCurent);
        }
        else {
            System.out.println("Volumul nu se poate seta, nr trepte prea mare");
        }
    }
    void daMaiIncet(){
        daMaiIncet(1);
    }
    void daMaiIncet(int nrTrepte) {
        if (!bPornit){
            System.out.println("Volumul nu se poate seta, radio este oprit");
            return;
        }
        if (nVolCurent- nrTrepte>=0)
        {
            nVolCurent-=nrTrepte;
            System.out.println("Volumul a fost setat la:"+ nVolCurent);
        }
        else {
            System.out.println("Volumul nu se poate seta, nr trepte prea mare");
        }
    }
    public void setVolCurent(int n){
        nVolCurent=n;
    }
    int getVolCurent(){return nVolCurent;}
    void setPornit(boolean bPornit){
        this.bPornit=bPornit;
    }
    public boolean getPornit(){return bPornit;}

    public static void main(String []args){
        Radio radio = new Radio(10);
        radio.stare();
        radio.porneste();
        radio.postUrmator();
    }


}