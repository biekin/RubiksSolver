import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Algo_MainTest {

    public static void main(String [] args) throws Exception{
       File plik = new File("kostka_plik.txt");
        ArrayList<String> State =new ArrayList<String>(Arrays.asList(
                "3","6","4","6",
                "3","2","1","5",
                "3","2","4","6",
                "5","4","2","3",
                "1","5","2","6",
                "1","1","4","5"));
        ArrayList<String> okState =new ArrayList<String>(Arrays.asList(
                "6","1","3","4",
                "6","2","5","4",
                "3","2","5","1",
                "5","2","6","4",
                "1","5","2","3",
                "1","6","4","3"));
        ArrayList<String> tryState =new ArrayList<String>(Arrays.asList(
                "1","4","3","2",
                "3","1","6","5",
                "5","2","5","1",
                "6","6","5","3",
                "3","4","6","4",
                "1","4","2","2"));
        State=tryState;
//

        ArrayList<ArrayList<String>> ListOfStates = new ArrayList<>(Arrays.asList(State));
        ArrayList<String> ListOfMoves = new ArrayList<String>(Arrays.asList("p0"));

        long start=System.nanoTime();
        int j=0;



        ArrayList<String> stateB = new ArrayList<>();
        ArrayList<String> stateD= new ArrayList<>();
        ArrayList<String> stateU= new ArrayList<>();
        ArrayList<String> stateL= new ArrayList<>();
        ArrayList<String> stateR= new ArrayList<>();
        ArrayList<String> stateF= new ArrayList<>();
        ArrayList<String> stateB2 = new ArrayList<>();
        ArrayList<String> stateD2= new ArrayList<>();
        ArrayList<String> stateU2= new ArrayList<>();
        ArrayList<String> stateL2= new ArrayList<>();
        ArrayList<String> stateR2= new ArrayList<>();
        ArrayList<String> stateF2= new ArrayList<>();
        ArrayList<String> stateBp = new ArrayList<>();
        ArrayList<String> stateDp= new ArrayList<>();
        ArrayList<String> stateUp= new ArrayList<>();
        ArrayList<String> stateLp= new ArrayList<>();
        ArrayList<String> stateRp= new ArrayList<>();
        ArrayList<String> stateFp= new ArrayList<>();
        String move0="p0";
        Algo_moves2x2x2.save(State,j,move0);
        char lastmove;
        int i =0;
        while (true){


            if(Algo_moves2x2x2.Found(State))
                break;

            move0=ListOfMoves.get(i);
            lastmove=move0.charAt(move0.length()-2);
            if (lastmove!='F') {
                stateF = Algo_moves2x2x2.F(State);
                ListOfStates.add(stateF);
                ListOfMoves.add(move0 + "F1");
                j++;
                if (Algo_moves2x2x2.Found(stateF))
                    break;
//                Algo_moves2x2x2.save(stateF, j, move0 + "F1");
            }
//            stateB=Algo_moves2x2x2.B(State);
//            ListOfStates.add(stateB);
//            ListOfMoves.add(move0+"B1");
//
//            j++;
//            Algo_moves2x2x2.save(stateB,j,move0+"B1");

            if (lastmove!='D') {

                stateD = Algo_moves2x2x2.D(State);
                ListOfStates.add(stateD);
                ListOfMoves.add(move0 + "D1");

                j++;
                if (Algo_moves2x2x2.Found(stateD))
                    break;
//                Algo_moves2x2x2.save(stateD, j, move0 + "D1");
            }

//            stateU=Algo_moves2x2x2.U(State);
//            ListOfStates.add(stateU);
//            ListOfMoves.add(move0+"U1");
//
//            j++;
//            Algo_moves2x2x2.save(stateU,j,move0+"U1");

            if (lastmove!='L') {

                stateL = Algo_moves2x2x2.L(State);
                ListOfStates.add(stateL);
                ListOfMoves.add(move0 + "L1");

                j++;
                if (Algo_moves2x2x2.Found(stateL))
                    break;
 //               Algo_moves2x2x2.save(stateL, j, move0 + "L1");
            }

//            stateR=Algo_moves2x2x2.R(State);
//            ListOfStates.add(stateR);
//            ListOfMoves.add(move0+"R1");
//
//            j++;
//            Algo_moves2x2x2.save(stateR,j,move0+"R1");
            if (lastmove!='F') {

                stateF2 = Algo_moves2x2x2.F2(State);
                ListOfStates.add(stateF2);
                ListOfMoves.add(move0 + "F2");
                j++;
                if (Algo_moves2x2x2.Found(stateF2))
                    break;
//                Algo_moves2x2x2.save(stateF2, j, move0 + "F2");
            }
//            stateB2=Algo_moves2x2x2.B2(State);
//            ListOfStates.add(stateB2);
//            ListOfMoves.add(move0+"B2");
//
//            j++;
//            Algo_moves2x2x2.save(stateB2,j,move0+"B2");

            if (lastmove!='D') {

                stateD2 = Algo_moves2x2x2.D2(State);
                ListOfStates.add(stateD2);
                ListOfMoves.add(move0 + "D2");

                j++;
                if (Algo_moves2x2x2.Found(stateD2))
                    break;
//                Algo_moves2x2x2.save(stateD2, j, move0 + "D2");
            }

//            stateU2=Algo_moves2x2x2.U2(State);
//            ListOfStates.add(stateU2);
//            ListOfMoves.add(move0+"U2");
//
//            j++;
//            Algo_moves2x2x2.save(stateU2,j,move0+"U2");

            if (lastmove!='L') {

                stateL2 = Algo_moves2x2x2.L2(State);
                ListOfStates.add(stateL2);
                ListOfMoves.add(move0 + "L2");

                j++;
                if (Algo_moves2x2x2.Found(stateL2))
                    break;
//                Algo_moves2x2x2.save(stateL2, j, move0 + "L2");
            }

//            stateR2=Algo_moves2x2x2.R2(State);
//            ListOfStates.add(stateR2);
//            ListOfMoves.add(move0+"R2");
//
//            j++;
//            Algo_moves2x2x2.save(stateR2,j,move0+"R2");

            if (lastmove!='F') {

                stateFp = Algo_moves2x2x2.Fprim(State);
                ListOfStates.add(stateFp);
                ListOfMoves.add(move0 + "Fp");
                j++;
                if (Algo_moves2x2x2.Found(stateFp))
                    break;
//                Algo_moves2x2x2.save(stateFp, j, move0 + "Fp");
            }
//            stateBp=Algo_moves2x2x2.Bprim(State);
//            ListOfStates.add(stateBp);
//            ListOfMoves.add(move0+"Bp");
//
//            j++;
//            Algo_moves2x2x2.save(stateBp,j,move0+"Bp");

            if (lastmove!='D') {

                stateDp = Algo_moves2x2x2.Dprim(State);
                ListOfStates.add(stateDp);
                ListOfMoves.add(move0 + "Dp");

                j++;
                if (Algo_moves2x2x2.Found(stateDp))
                    break;
//                Algo_moves2x2x2.save(stateDp, j, move0 + "Dp");
            }

//            stateUp=Algo_moves2x2x2.Uprim(State);
//            ListOfStates.add(stateUp);
//            ListOfMoves.add(move0+"Up");
//
//            j++;
//            Algo_moves2x2x2.save(stateUp,j,move0+"Up");

            if (lastmove!='L') {

                stateLp = Algo_moves2x2x2.Lprim(State);
                ListOfStates.add(stateLp);
                ListOfMoves.add(move0 + "Lp");

                j++;
                if (Algo_moves2x2x2.Found(stateLp))
                    break;
//                Algo_moves2x2x2.save(stateLp, j, move0 + "Lp");
            }

//            stateRp=Algo_moves2x2x2.Rprim(State);
//            ListOfStates.add(stateRp);
//            ListOfMoves.add(move0+"Rp");
//
//            j++;
//            Algo_moves2x2x2.save(stateRp,j,move0+"Rp");


            i++;



            State=ListOfStates.get(i);


        }
        long stop=System.nanoTime();

        System.out.println(ListOfMoves.get(j));
        System.out.println(ListOfStates.get(j));
        System.out.println(stop-start);



    }

}
