package lab7.task4;

public class Main {

    public static void main(String[] args) {

        SuperClass letter = new SuperClass('V');
        System.out.println("Буква: " + letter.symb);

        SuperClass letterclone = new SuperClass(letter);
        System.out.println("Буква клон: " + letterclone.symb);

        SubClassOne vaccine = new SubClassOne("Спутник", 'V');
        System.out.println("Первая партия вакцин: " + vaccine.text + " " + vaccine.symb);

        SubClassOne vaccineclone = new SubClassOne(vaccine);
        System.out.println("Вторая партия вакцин: " + vaccineclone.text + " " + vaccineclone.symb);

        SubClassTwo numberOfAmpoules = new SubClassTwo("Спутник" ,'V', 15_000);
        System.out.println("Количество ампул первой партии: " + numberOfAmpoules.text +
                " " + numberOfAmpoules.symb + " " + numberOfAmpoules.num);

        SubClassTwo numberOfAmpoulesClone = new SubClassTwo(numberOfAmpoules);
        System.out.println("Количество ампул второй партии: " + numberOfAmpoulesClone.text +
                " " + numberOfAmpoulesClone.symb + " " + numberOfAmpoulesClone.num);
    }
}
