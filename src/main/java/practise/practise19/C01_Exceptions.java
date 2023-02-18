package practise.practise19;

public class C01_Exceptions {
    //verilen iki stringin uzunluk acisindan birbirinin kac kati oldugunu veren kodu yaziniz

    public static void main(String[] args) {
        double r1 =karakterSayisiniKarsilastir("Tester","Dev");
        System.out.println(r1);
        double r2 =karakterSayisiniKarsilastir("Tester","");
        System.out.println(r2);
        double r3 =karakterSayisiniKarsilastir(null,"MehmetG");
        System.out.println(r3);
    }

    private static double karakterSayisiniKarsilastir(String str1, String str2) {

        double result =0;

        try {
            result = str1.length()/str2.length();
        } catch (ArithmeticException e) {
            System.err.println("PAYDA SIFIR OLAMAZ.." + e.getMessage());

        }catch (NullPointerException e) {
            System.err.println("length methodu null ile hata verir.." + e.getMessage());
        }catch (Exception e) {
                    System.err.println("PAYDA SIFIR OLAMAZ"+e.getMessage());
        } finally {
            System.out.println("Database 'le baglanti kesilsin..");
        }
        return result;


    }
}
