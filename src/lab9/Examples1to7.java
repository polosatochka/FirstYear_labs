package lab9;

public class Examples1to7 {

    public static void main(String[] args) {
        System.out.println("1.Генерируется и перехватывается исключение RuntimeException");

        try { //контролируем блок кода, который может вызвать ошибку
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка"); //самостоятельно генерируем исключение
        }
        catch(RuntimeException e){ //перехватываем исключение
            System.out.println("1 " + e); //обрабатываем исключение и выводим сообщение об ошибке
        }
        System.out.println("2"); //код, выполняемый после оператора catch
        System.out.println("--------------------------------------------");

        System.out.println("2.Перехват исключения с помощью предка");

        try{//контролируем блок кода, который может вызвать ошибку
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка"); //самостоятельно генерируем исключение
        //    System.out.println("1"); //код, который не выполнится
        }
        catch (Exception e){ //перехватывание исключения типа родителя
            System.out.println("2 " + e); //обрабатываем исключение и выводим сообщение об ошибке
        }
        System.out.println("3"); //код, выполняемый после оператора catch
        System.out.println("--------------------------------------------");

        System.out.println("3.Перехват исключения подходящим классом");
        try{
            System.out.println("0");
            throw new RuntimeException("ошибка");//самостоятельно генерируем "ошибку"
        }catch (NullPointerException e){ //перехват исключения операторами catch от потомка к родителю
            System.out.println("1");     //компилятор выберет нужный и пропустит остальные catch
        }catch (RuntimeException e){
            System.out.println("2");
        }catch (Exception e){
            System.out.println("3");
        }
        System.out.println("4");//код,выполняемый после оператора catch

        System.out.println("--------------------------------------------");

        System.out.println("4.Перехват исключения подходящим классом (с Error)");
        try{
            System.out.println("0");
            throw new RuntimeException("ошибка"); //самостоятельно генерируем "ошибку"
        } catch (NullPointerException e){ //перехват исключения операторами catch от потомка к родителю
            System.out.println("1");  //компилятор выберет нужный и пропустит остальные catch
        }catch (Exception e){
            System.out.println("2");
        }catch (Error e){ //исключения типа Error не должны обрабатываться
            System.out.println("3");
        }
        System.out.println("4");//код,выполняемый после оператора catch
        System.out.println("--------------------------------------------");

        System.out.println("5. Исключение не перехватыватся");
      //  try{
            System.out.println("0");
      //      throw new RuntimeException("ошибка");//самостоятельно генерируем "ошибку"
      //  }catch (NullPointerException e){//перехват ошибки подкласса, а не класса RuntimeException, программа далее не выполняется. Другой тип исключения
            System.out.println("1");
      //  }
        System.out.println("2"); //код,выполняемый после оператора catch
        System.out.println("--------------------------------------------");

        System.out.println("6. Правильная последовательность перехвата исключений");
        try{
            System.out.println("0");
            throw new NullPointerException("ошибка");//самостоятельно генерируем "ошибку"
        }catch (ArithmeticException e){//перехват исключения операторами catch от потомка к родителю
            System.out.println("1");
        }catch (RuntimeException e){
            System.out.println("2");
        }catch (Exception e){//класс Exception стоит после всех своих потомков
            System.out.println("3");
        }
        System.out.println("4");//код,выполняемый после оператора catch
        System.out.println("--------------------------------------------");

        System.out.println("7. Перехват исключения чужим catch невозможен даже верном типе исключения");
        try{
            System.out.println("0");
            throw new NullPointerException("ошибка"); //самостоятельно генерируем "ошибку"
        } catch (NullPointerException e){//перехватывание исключения такого же типа
            System.out.println("1");
        //    throw new ArithmeticException(); //генерируем новое исключение
        } catch (ArithmeticException e){//попытка перехватывания нового исключения. не выполняется
            System.out.println("2");
        }
        System.out.println("3");//код,НЕвыполняемый после оператора catch
        System.out.println("--------------------------------------------");
    }


}
