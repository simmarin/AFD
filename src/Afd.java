

public class Afd {

    public String q;

    String[] e ;
    public void  validar (String entrada[]){
        String[]estados= {"q0", "q1", "q2","q3","q4"};

        String[]estado0= {"q0", "q4", "q3","q3","q4"};
        String[]estado1= {"q1", "q2", "q1","q3","q4"};


        for (int i = 0 ; i < entrada.length ; i++) {
            q="q0";
          if (entrada[i]=="0"){
              for (int m = 0 ; m < estado1.length ; m++) {

                  boolean tm=new String(q).equals(estado1[m]);

                  if (tm==true){
                      String pt=estado1[m];
                      System.out.print(pt);
                      q=pt+q;
                  }

              }

            }
            else if  (entrada[i]=="0"){
              for (int n = 0 ; n < estado0.length ; n++) {

                  boolean tm=new String(q).equals(estado0[n]);

                  if (tm==true){
                      String postemp=estado0[n];
                      System.out.print(q);
                      q=postemp;
                  }
        }
            }


    }
    /*public void  validar2 (String tabla[][],String entrada[]){
     for (int j= 0; j <tabla.length; j++) {

        for(int o= 0; o <tabla[0].length; o++) {

            System.out.print(tabla[j][o] + " ");

        }
        System.out.println();
    }
    }*/
}

    }
