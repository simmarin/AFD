

public class Afd {

    public String q;

    String[] e ;
    public void  validar (String entrada[]){


        String[]estado0= {"q0", "q4", "q3","q3","q4"};

        String[]estado1= {"q1", "q2", "q1","q3","q4"};


        for (int i = 0 ; i < entrada.length ; i++) {
            String temp;
            if (q==null){
                q="q0";
            }else

            {

          if (entrada[i]=="0"){


                  boolean tm=new String(q).equals(estado0[0]);

                  if (tm==true){
                      String pt=estado1[0];
                      System.out.print(pt);
                      q=pt;
                  }

            }
             if  (entrada[i]=="1"){
              for (int n = 0 ; n < estado1.length ; n++) {

                  boolean tm=new String(q).equals(estado1[0]);

                  if (tm==true){
                      String postemp=estado1[0];
                      System.out.print(postemp);
                      q=postemp;
                  }
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
