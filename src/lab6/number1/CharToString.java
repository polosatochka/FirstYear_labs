package lab6.number1;

public class CharToString {

        private char chr;
        private String txt;

        //метод с символьным аргументом присваивает значение символьному полю
        public void setCharValue(char chr) {
            this.chr = chr;
        }

        //метод с текстовым аргументом определяет значение текстового поля
        public void setTxtValue(String txt) {
            this.txt = txt;
        }

        //          метод с аргументом - символьным массивом
        public void setMassivValue (char[] massiv) {
            if (massiv.length == 1) {
                this.chr = massiv[0];
            }
            else if(massiv.length>1){
                String myString = new String (massiv);
                this.txt = myString;
            }
        }
        //  вернуть значение символьного поля
        public char getCharValue(){
            return chr;
        }
        //      вернуть значение текстового поля
        public String getTxtValue(){
            return txt;
        }

        public void showCharValue (){
            System.out.println("Значение символьного поля: " + getCharValue());
        }

        public void showTextValue (){
            System.out.println("Значение текстовой строки: " + getTxtValue());
        }
    }

