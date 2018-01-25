import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Algo_moves2x2x2
{
    public static ArrayList<String> L (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(0);
        String tmp2 = Lstate.get(3);
        String tmp3 = Lstate.get(9);
        String tmp4 = Lstate.get(10);
        String tmp5 = Lstate.get(15);
        String tmp6 = Lstate.get(16);
        String tmp7 = Lstate.get(19);
        String tmp8 = Lstate.get(20);
        String tmp9 = Lstate.get(23);
        Lstate.remove(23);
        Lstate.remove(20);
        Lstate.remove(19);
        Lstate.remove(16);
        Lstate.remove(15);
        Lstate.remove(10);
        Lstate.remove(9);
        Lstate.remove(3);
        Lstate.remove(0);
        Lstate.add(0,tmp6);
        Lstate.add(3,tmp7);
        Lstate.add(9,tmp9);
        Lstate.add(10,tmp8);
        Lstate.add(12,tmp5);
        Lstate.add(16,tmp4);
        Lstate.add(19,tmp3);
        Lstate.add(20,tmp);
        Lstate.add(23,tmp2);
        return Lstate;
    }
    public static ArrayList<String> R (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(1);
        String tmp2 = Lstate.get(2);
        String tmp3 = Lstate.get(7);
        String tmp4 = Lstate.get(8);
        String tmp5 = Lstate.get(11);
        String tmp6 = Lstate.get(17);
        String tmp7 = Lstate.get(18);
        String tmp8 = Lstate.get(21);
        String tmp9 = Lstate.get(22);
        Lstate.remove(22);
        Lstate.remove(21);
        Lstate.remove(18);
        Lstate.remove(17);
        Lstate.remove(11);
        Lstate.remove(8);
        Lstate.remove(7);
        Lstate.remove(2);
        Lstate.remove(1);
        Lstate.add(1,tmp8);
        Lstate.add(2,tmp9);
        Lstate.add(4,tmp3);
        Lstate.add(8,tmp7);
        Lstate.add(11,tmp6);
        Lstate.add(17,tmp);
        Lstate.add(18,tmp2);
        Lstate.add(21,tmp5);
        Lstate.add(22,tmp4);


        return Lstate;
    }
    public static ArrayList<String> F (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(3);
        String tmp2 = Lstate.get(19);
        String tmp3 = Lstate.get(18);
        String tmp4 = Lstate.get(20);
        String tmp5 = Lstate.get(21);
        String tmp6 = Lstate.get(13);
        String tmp7 = Lstate.get(14);
        String tmp8 = Lstate.get(4);
        String tmp9 = Lstate.get(7);
        Lstate.remove(21);
        Lstate.remove(20);
        Lstate.remove(19);
        Lstate.remove(18);
        Lstate.remove(14);
        Lstate.remove(13);
        Lstate.remove(7);
        Lstate.remove(4);
        Lstate.remove(3);
        Lstate.add(0,tmp);
        Lstate.add(4,tmp2);
        Lstate.add(7,tmp3);
        Lstate.add(13,tmp4);
        Lstate.add(14,tmp5);
        Lstate.add(18,tmp6);
        Lstate.add(19,tmp7);
        Lstate.add(20,tmp9);
        Lstate.add(21,tmp8);







        return Lstate;
    }
    public static ArrayList<String> U (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(0);
        String tmp2 = Lstate.get(1);
        String tmp3 = Lstate.get(4);
        String tmp4 = Lstate.get(5);
        String tmp5 = Lstate.get(8);
        String tmp6 = Lstate.get(9);
        String tmp7 = Lstate.get(12);
        String tmp8 = Lstate.get(13);
        String tmp9 = Lstate.get(19);
        Lstate.remove(19);
        Lstate.remove(13);
        Lstate.remove(12);
        Lstate.remove(9);
        Lstate.remove(8);
        Lstate.remove(5);
        Lstate.remove(4);
        Lstate.remove(1);
        Lstate.remove(0);
        Lstate.add(0,tmp3);
        Lstate.add(1,tmp4);
        Lstate.add(4,tmp5);
        Lstate.add(5,tmp6);
        Lstate.add(8,tmp7);
        Lstate.add(9,tmp8);
        Lstate.add(12,tmp);
        Lstate.add(13,tmp2);
        Lstate.add(16,tmp9);
        return Lstate;
    }
    public static ArrayList<String> B (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(5);
        String tmp2 = Lstate.get(6);
        String tmp3 = Lstate.get(8);
        String tmp4 = Lstate.get(12);
        String tmp5 = Lstate.get(15);
        String tmp6 = Lstate.get(16);
        String tmp7 = Lstate.get(17);
        String tmp8 = Lstate.get(22);
        String tmp9 = Lstate.get(23);
        Lstate.remove(23);
        Lstate.remove(22);
        Lstate.remove(17);
        Lstate.remove(16);
        Lstate.remove(15);
        Lstate.remove(12);
        Lstate.remove(8);
        Lstate.remove(6);
        Lstate.remove(5);
        Lstate.add(5,tmp6);
        Lstate.add(6,tmp7);
        Lstate.add(11,tmp3);
        Lstate.add(12,tmp9);
        Lstate.add(15,tmp8);
        Lstate.add(16,tmp5);
        Lstate.add(17,tmp4);
        Lstate.add(22,tmp);
        Lstate.add(23,tmp2);
        return Lstate;
    }
    public static ArrayList<String> D (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(2);
        String tmp2 = Lstate.get(3);
        String tmp3 = Lstate.get(6);
        String tmp4 = Lstate.get(7);
        String tmp5 = Lstate.get(10);
        String tmp6 = Lstate.get(11);
        String tmp7 = Lstate.get(14);
        String tmp8 = Lstate.get(15);
        String tmp9 = Lstate.get(23);
        Lstate.remove(23);
        Lstate.remove(15);
        Lstate.remove(14);
        Lstate.remove(11);
        Lstate.remove(10);
        Lstate.remove(7);
        Lstate.remove(6);
        Lstate.remove(3);
        Lstate.remove(2);
        Lstate.add(2,tmp7);
        Lstate.add(3,tmp8);
        Lstate.add(6,tmp);
        Lstate.add(7,tmp2);
        Lstate.add(10,tmp3);
        Lstate.add(11,tmp4);
        Lstate.add(14,tmp5);
        Lstate.add(15,tmp6);
        Lstate.add(20,tmp9);
        return Lstate;
    }
    public static ArrayList<String> Lprim (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(0);
        String tmp2 = Lstate.get(3);
        String tmp3 = Lstate.get(9);
        String tmp4 = Lstate.get(10);
        String tmp5 = Lstate.get(12);
        String tmp6 = Lstate.get(16);
        String tmp7 = Lstate.get(19);
        String tmp8 = Lstate.get(20);
        String tmp9 = Lstate.get(23);
        Lstate.remove(23);
        Lstate.remove(20);
        Lstate.remove(19);
        Lstate.remove(16);
        Lstate.remove(12);
        Lstate.remove(10);
        Lstate.remove(9);
        Lstate.remove(3);
        Lstate.remove(0);
        Lstate.add(0,tmp8);
        Lstate.add(3,tmp9);
        Lstate.add(9,tmp7);
        Lstate.add(10,tmp6);
        Lstate.add(15,tmp5);
        Lstate.add(16,tmp);
        Lstate.add(19,tmp2);
        Lstate.add(20,tmp4);
        Lstate.add(23,tmp3);
        return Lstate;
    }
    public static ArrayList<String> Rprim (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(1);
        String tmp2 = Lstate.get(2);
        String tmp3 = Lstate.get(4);
        String tmp4 = Lstate.get(8);
        String tmp5 = Lstate.get(11);
        String tmp6 = Lstate.get(17);
        String tmp7 = Lstate.get(18);
        String tmp8 = Lstate.get(21);
        String tmp9 = Lstate.get(22);
        Lstate.remove(22);
        Lstate.remove(21);
        Lstate.remove(18);
        Lstate.remove(17);
        Lstate.remove(11);
        Lstate.remove(8);
        Lstate.remove(4);
        Lstate.remove(2);
        Lstate.remove(1);
        Lstate.add(1,tmp6);
        Lstate.add(2,tmp7);
        Lstate.add(7,tmp3);
        Lstate.add(8,tmp9);
        Lstate.add(11,tmp8);
        Lstate.add(17,tmp5);
        Lstate.add(18,tmp4);
        Lstate.add(21,tmp);
        Lstate.add(22,tmp2);

        return Lstate;
    }
    public static ArrayList<String> Fprim (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;

        String tmp = Lstate.get(0);
        String tmp2 = Lstate.get(4);
        String tmp3 = Lstate.get(7);
        String tmp4 = Lstate.get(13);
        String tmp5 = Lstate.get(14);
        String tmp6 = Lstate.get(18);
        String tmp7 = Lstate.get(19);
        String tmp8 = Lstate.get(20);
        String tmp9 = Lstate.get(21);
        Lstate.remove(21);
        Lstate.remove(20);
        Lstate.remove(19);
        Lstate.remove(18);
        Lstate.remove(14);
        Lstate.remove(13);
        Lstate.remove(7);
        Lstate.remove(4);
        Lstate.remove(0);
        Lstate.add(3,tmp);
        Lstate.add(4,tmp9);
        Lstate.add(7,tmp8);
        Lstate.add(13,tmp6);
        Lstate.add(14,tmp7);
        Lstate.add(18,tmp3);
        Lstate.add(19,tmp2);
        Lstate.add(20,tmp4);
        Lstate.add(21,tmp5);
        return Lstate;
    }
    public static ArrayList<String> Uprim (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(0);
        String tmp2 = Lstate.get(1);
        String tmp3 = Lstate.get(4);
        String tmp4 = Lstate.get(5);
        String tmp5 = Lstate.get(8);
        String tmp6 = Lstate.get(9);
        String tmp7 = Lstate.get(12);
        String tmp8 = Lstate.get(13);
        String tmp9 = Lstate.get(16);
        Lstate.remove(16);
        Lstate.remove(13);
        Lstate.remove(12);
        Lstate.remove(9);
        Lstate.remove(8);
        Lstate.remove(5);
        Lstate.remove(4);
        Lstate.remove(1);
        Lstate.remove(0);
        Lstate.add(0,tmp7);
        Lstate.add(1,tmp8);
        Lstate.add(4,tmp);
        Lstate.add(5,tmp2);
        Lstate.add(8,tmp3);
        Lstate.add(9,tmp4);
        Lstate.add(12,tmp5);
        Lstate.add(13,tmp6);
        Lstate.add(19,tmp9);
        return Lstate;
    }
    public static  ArrayList<String> Bprim (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(5);
        String tmp2 = Lstate.get(6);
        String tmp3 = Lstate.get(11);
        String tmp4 = Lstate.get(12);
        String tmp5 = Lstate.get(15);
        String tmp6 = Lstate.get(16);
        String tmp7 = Lstate.get(17);
        String tmp8 = Lstate.get(22);
        String tmp9 = Lstate.get(23);
        Lstate.remove(23);
        Lstate.remove(22);
        Lstate.remove(17);
        Lstate.remove(16);
        Lstate.remove(15);
        Lstate.remove(12);
        Lstate.remove(11);
        Lstate.remove(6);
        Lstate.remove(5);
        Lstate.add(5,tmp8);
        Lstate.add(6,tmp9);
        Lstate.add(8,tmp3);
        Lstate.add(12,tmp7);
        Lstate.add(15,tmp6);
        Lstate.add(16,tmp);
        Lstate.add(17,tmp2);
        Lstate.add(22,tmp5);
        Lstate.add(23,tmp4);
        return Lstate;
    }
    public static ArrayList<String> Dprim (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(2);
        String tmp2 = Lstate.get(3);
        String tmp3 = Lstate.get(6);
        String tmp4 = Lstate.get(7);
        String tmp5 = Lstate.get(10);
        String tmp6 = Lstate.get(11);
        String tmp7 = Lstate.get(14);
        String tmp8 = Lstate.get(15);
        String tmp9 = Lstate.get(20);
        Lstate.remove(20);
        Lstate.remove(15);
        Lstate.remove(14);
        Lstate.remove(11);
        Lstate.remove(10);
        Lstate.remove(7);
        Lstate.remove(6);
        Lstate.remove(3);
        Lstate.remove(2);
        Lstate.add(2,tmp3);
        Lstate.add(3,tmp4);
        Lstate.add(6,tmp5);
        Lstate.add(7,tmp6);
        Lstate.add(10,tmp7);
        Lstate.add(11,tmp8);
        Lstate.add(14,tmp);
        Lstate.add(15,tmp2);
        Lstate.add(23,tmp9);
        return Lstate;
    }
    public static ArrayList<String> L2 (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(0);
        String tmp2 = Lstate.get(3);
        String tmp3 = Lstate.get(9);
        String tmp4 = Lstate.get(10);
        String tmp5 = Lstate.get(14);
        String tmp6 = Lstate.get(15);
        String tmp7 = Lstate.get(16);
        String tmp8= Lstate.get(19);
        String tmp9 = Lstate.get(20);
        String tmp10 = Lstate.get(23);
        Lstate.remove(23);
        Lstate.remove(20);
        Lstate.remove(19);
        Lstate.remove(16);
        Lstate.remove(15);
        Lstate.remove(14);
        Lstate.remove(10);
        Lstate.remove(9);
        Lstate.remove(3);
        Lstate.remove(0);
        Lstate.add(0,tmp4);
        Lstate.add(3,tmp3);
        Lstate.add(9,tmp2);
        Lstate.add(10,tmp);
        Lstate.add(12,tmp5);
        Lstate.add(13,tmp6);
        Lstate.add(16,tmp9);
        Lstate.add(19,tmp10);
        Lstate.add(20,tmp7);
        Lstate.add(23,tmp8);

        return Lstate;
    }
    public static ArrayList<String> R2 (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(1);
        String tmp2 = Lstate.get(2);
        String tmp3 = Lstate.get(6);
        String tmp4 = Lstate.get(7);
        String tmp5 = Lstate.get(8);

        String tmp6 = Lstate.get(11);
        String tmp7 = Lstate.get(17);
        String tmp8 = Lstate.get(18);
        String tmp9 = Lstate.get(21);
        String tmp10 = Lstate.get(22);
        Lstate.remove(22);
        Lstate.remove(21);
        Lstate.remove(18);
        Lstate.remove(17);
        Lstate.remove(11);
        Lstate.remove(8);
        Lstate.remove(7);
        Lstate.remove(6);
        Lstate.remove(2);
        Lstate.remove(1);
        Lstate.add(1,tmp6);
        Lstate.add(2,tmp5);
        Lstate.add(4,tmp3);
        Lstate.add(5,tmp4);
        Lstate.add(8,tmp2);
        Lstate.add(11,tmp);
        Lstate.add(17,tmp9);
        Lstate.add(18,tmp10);
        Lstate.add(21,tmp7);
        Lstate.add(22,tmp8);
        return Lstate;
    }
    public static ArrayList<String> F2 (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(2);
        String tmp2 = Lstate.get(3);
        String tmp3 = Lstate.get(4);
        String tmp4 = Lstate.get(7);
        String tmp5 = Lstate.get(13);
        String tmp6 = Lstate.get(14);
        String tmp7 = Lstate.get(18);
        String tmp8 = Lstate.get(19);
        String tmp9 = Lstate.get(20);
        String tmp10 = Lstate.get(21);
        Lstate.remove(21);
        Lstate.remove(20);
        Lstate.remove(19);
        Lstate.remove(18);
        Lstate.remove(14);
        Lstate.remove(13);
        Lstate.remove(7);
        Lstate.remove(4);
        Lstate.remove(3);
        Lstate.remove(2);

        Lstate.add(0,tmp);
        Lstate.add(1,tmp2);
        Lstate.add(4,tmp6);
        Lstate.add(7,tmp5);
        Lstate.add(13,tmp4);
        Lstate.add(14,tmp3);
        Lstate.add(18,tmp9);
        Lstate.add(19,tmp10);
        Lstate.add(20,tmp7);
        Lstate.add(21,tmp8);
        return Lstate;
    }
    public static ArrayList<String> U2 (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(0);
        String tmp2 = Lstate.get(1);
        String tmp3 = Lstate.get(4);
        String tmp4 = Lstate.get(5);
        String tmp5 = Lstate.get(8);
        String tmp6 = Lstate.get(9);
        String tmp7 = Lstate.get(12);
        String tmp8 = Lstate.get(13);
        String tmp9 = Lstate.get(18);
        String tmp10 = Lstate.get(19);

        Lstate.remove(19);
        Lstate.remove(18);
        Lstate.remove(13);
        Lstate.remove(12);
        Lstate.remove(9);
        Lstate.remove(8);
        Lstate.remove(5);
        Lstate.remove(4);
        Lstate.remove(1);
        Lstate.remove(0);
        Lstate.add(0,tmp5);
        Lstate.add(1,tmp6);
        Lstate.add(4,tmp7);
        Lstate.add(5,tmp8);
        Lstate.add(8,tmp);
        Lstate.add(9,tmp2);
        Lstate.add(12,tmp3);
        Lstate.add(13,tmp4);
        Lstate.add(16,tmp9);
        Lstate.add(17,tmp10);

        return Lstate;
    }
    public static ArrayList<String> B2 (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(5);
        String tmp2 = Lstate.get(6);
        String tmp3 = Lstate.get(10);
        String tmp4 = Lstate.get(11);
        String tmp5 = Lstate.get(12);
        String tmp6 = Lstate.get(15);
        String tmp7 = Lstate.get(16);
        String tmp8 = Lstate.get(17);
        String tmp9 = Lstate.get(22);
        String tmp10 = Lstate.get(23);
        Lstate.remove(23);
        Lstate.remove(22);
        Lstate.remove(17);
        Lstate.remove(16);
        Lstate.remove(15);
        Lstate.remove(12);
        Lstate.remove(11);
        Lstate.remove(10);
        Lstate.remove(6);
        Lstate.remove(5);
        Lstate.add(5,tmp6);
        Lstate.add(6,tmp5);
        Lstate.add(8,tmp3);
        Lstate.add(9,tmp4);
        Lstate.add(12,tmp2);
        Lstate.add(15,tmp);
        Lstate.add(16,tmp9);
        Lstate.add(17,tmp10);
        Lstate.add(22,tmp7);
        Lstate.add(23,tmp8);
        return Lstate;
    }
    public static ArrayList<String> D2 (ArrayList<String> state){
        ArrayList<String> Lstate =new ArrayList<>(state) ;
        String tmp = Lstate.get(2);
        String tmp2 = Lstate.get(3);
        String tmp3 = Lstate.get(6);
        String tmp4 = Lstate.get(7);
        String tmp5 = Lstate.get(10);
        String tmp6 = Lstate.get(11);
        String tmp7 = Lstate.get(14);
        String tmp8 = Lstate.get(15);
        String tmp9 = Lstate.get(22);
        String tmp10 = Lstate.get(23);
        Lstate.remove(23);
        Lstate.remove(22);
        Lstate.remove(15);
        Lstate.remove(14);
        Lstate.remove(11);
        Lstate.remove(10);
        Lstate.remove(7);
        Lstate.remove(6);
        Lstate.remove(3);
        Lstate.remove(2);
        Lstate.add(2,tmp5);
        Lstate.add(3,tmp6);
        Lstate.add(6,tmp7);
        Lstate.add(7,tmp8);
        Lstate.add(10,tmp);
        Lstate.add(11,tmp2);
        Lstate.add(14,tmp3);
        Lstate.add(15,tmp4);
        Lstate.add(20,tmp9);
        Lstate.add(21,tmp10);
        return Lstate;
    }

    public static boolean Found(ArrayList<String> state){
//        ArrayList<String> okState1 =new ArrayList<String>(Arrays.asList(
//                "1","1","1","1",
//                "2","2","2","2",
//                "3","3","3","3",
//                "4","4","4","4",
//                "5","5","5","5",
//                "6","6","6","6"));
//        ArrayList<String> okState2 =new ArrayList<String>(Arrays.asList(
//                "6","6","6","6",
//                "4","4","4","4",
//                "5","5","5","5",
//                "2","2","2","2",
//                "3","3","3","3",
//                "1","1","1","1"
//                ));
            if (!(
                    state.get(0).equals(state.get(1)) &&
                            state.get(2).equals(state.get(3)) &&
                            state.get(2).equals(state.get(1))&&

                            state.get(4).equals(state.get(5)) &&
                            state.get(5).equals(state.get(6)) &&
                            state.get(6).equals(state.get(7))&&

                            state.get(8).equals(state.get(9)) &&
                            state.get(9).equals(state.get(10)) &&
                            state.get(11).equals(state.get(10))&&

                            state.get(12).equals(state.get(13)) &&
                            state.get(13).equals(state.get(14)) &&
                            state.get(15).equals(state.get(14))&&

                            state.get(16).equals(state.get(17)) &&
                            state.get(19).equals(state.get(18)) &&
                            state.get(17).equals(state.get(18))&&

                            state.get(20).equals(state.get(21)) &&
                            state.get(23).equals(state.get(22)) &&
                            state.get(21).equals(state.get(22)))


            )
                    return false;

        return true;
    }
    public static void main(String [] args) throws Exception {
        ArrayList<String> tryState =new ArrayList<String>(Arrays.asList(
                "3","6","4","6",
                "3","2","1","5",
                "3","2","4","6",
                "5","4","2","3",
                "1","5","2","6",
                "1","1","4","5"));
        ArrayList<String> okState =new ArrayList<String>(Arrays.asList(
               "1","1","2","3",
                "3","3","4","5",
                "1","2","3","5",
                "1","4","2","6",
                "4","2","6","6",
                "5","4","6","5"));
        System.out.println(Algo_moves2x2x2.D(Algo_moves2x2x2.D(tryState)));
        System.out.println(Algo_moves2x2x2.D2(tryState));
        System.out.println(Algo_moves2x2x2.D(Algo_moves2x2x2.D(Algo_moves2x2x2.D(tryState))));
        System.out.println(Algo_moves2x2x2.Dprim(tryState));







    }
    public static void save(ArrayList<String> state,int i,String moves) throws Exception{
    String filePath = "D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\kostka_plik.txt";



        PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\MOJEPRYWATNE\\0nauka\\Informatyka\\Java_All\\PROJEKT\\src\\kostka_plik.txt",true));
        pw.print(i+" ");
        for (String stat : state)
                pw.print(stat);
        pw.print("  "+moves);

        pw.print("\n");




        pw.close();

    }
    public static String Algorithm(ArrayList<String> State) throws  Exception{
        ArrayList<ArrayList<String>> ListOfStates = new ArrayList<>(Arrays.asList(State));
        ArrayList<String> ListOfMoves = new ArrayList<String>(Arrays.asList("p0"));
        int j=0;



        ArrayList<String> stateD= new ArrayList<>();
        ArrayList<String> stateL= new ArrayList<>();
        ArrayList<String> stateF= new ArrayList<>();
        ArrayList<String> stateD2= new ArrayList<>();
        ArrayList<String> stateL2= new ArrayList<>();
        ArrayList<String> stateF2= new ArrayList<>();
        ArrayList<String> stateDp= new ArrayList<>();
        ArrayList<String> stateLp= new ArrayList<>();
        ArrayList<String> stateFp= new ArrayList<>();
        String move0="p0";
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
                ListOfMoves.add(move0 + "F ");
                j++;
                if (Algo_moves2x2x2.Found(stateF))
                    break;

            }

            if (lastmove!='D') {

                stateD = Algo_moves2x2x2.D(State);
                ListOfStates.add(stateD);
                ListOfMoves.add(move0 + "D ");

                j++;
                if (Algo_moves2x2x2.Found(stateD))
                    break;
            }

            if (lastmove!='L') {

                stateL = Algo_moves2x2x2.L(State);
                ListOfStates.add(stateL);
                ListOfMoves.add(move0 + "L ");

                j++;
                if (Algo_moves2x2x2.Found(stateL))
                    break;
            }

            if (lastmove!='F') {

                stateF2 = Algo_moves2x2x2.F2(State);
                ListOfStates.add(stateF2);
                ListOfMoves.add(move0 + "F2");
                j++;
                if (Algo_moves2x2x2.Found(stateF2))
                    break;
            }

            if (lastmove!='D') {

                stateD2 = Algo_moves2x2x2.D2(State);
                ListOfStates.add(stateD2);
                ListOfMoves.add(move0 + "D2");

                j++;
                if (Algo_moves2x2x2.Found(stateD2))
                    break;
            }

            if (lastmove!='L') {

                stateL2 = Algo_moves2x2x2.L2(State);
                ListOfStates.add(stateL2);
                ListOfMoves.add(move0 + "L2");

                j++;
                if (Algo_moves2x2x2.Found(stateL2))
                    break;
            }

            if (lastmove!='F') {

                stateFp = Algo_moves2x2x2.Fprim(State);
                ListOfStates.add(stateFp);
                ListOfMoves.add(move0 + "F\'");
                j++;
                if (Algo_moves2x2x2.Found(stateFp))
                    break;
            }

            if (lastmove!='D') {

                stateDp = Algo_moves2x2x2.Dprim(State);
                ListOfStates.add(stateDp);
                ListOfMoves.add(move0 + "D\'");

                j++;
                if (Algo_moves2x2x2.Found(stateDp))
                    break;
            }

            if (lastmove!='L') {

                stateLp = Algo_moves2x2x2.Lprim(State);
                ListOfStates.add(stateLp);
                ListOfMoves.add(move0 + "L\'");

                j++;
                if (Algo_moves2x2x2.Found(stateLp))
                    break;
            }


            i++;



            State=ListOfStates.get(i);


        }


        return ListOfMoves.get(j);
    }

}





