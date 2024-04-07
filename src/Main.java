public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание №2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание №3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание №6");
        var boxerBlue = 78.2;
        System.out.println("Масса одного боксёра " + boxerBlue + " кг");
        var boxerRed = 82.7;
        System.out.println("Масса второго боксёра " + boxerRed + " кг");
        var weightAllBoxer = boxerBlue + boxerRed;
        System.out.println("Масса двух боксёров " + weightAllBoxer + " кг");
        var differenceBoxers = boxerRed - boxerBlue;
        System.out.println("Разница между боксёрами " + differenceBoxers + " кг");

        System.out.println("Задание №7");
        var differenceBoxersPercent = boxerRed % boxerBlue;
        System.out.println("Разница между боксёрами " + differenceBoxersPercent + " кг");

        System.out.println("Задание №8");
        var totalHours = 640;
        var oneWorkerHours = 8;
        var totalWorkers = totalHours / oneWorkerHours;
        System.out.println("Всего работников в компании - " + totalWorkers + " человек");
        var moreWorkers = totalWorkers + 94;
        var moreHours = moreWorkers * oneWorkerHours;
        System.out.println("Если в компании работает " + moreWorkers + " человек, то всего " + moreHours +
                 " часов работы может быть поделено между сотрудниками");
    }
}