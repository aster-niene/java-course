package OOP;

// Прямоугольник
// Две стороны  a b
public class Rectangle {
     int a;
     int b; // Переменная доступная только созданным объектам
     static int times; // Переменная доступная даже без создания объекта

    public Rectangle(int a1, int b1){ // Метод конструктор. Отличается названием, таким-же как и сам класс
        //и тут-же запрашиваются переменные, необходимые для создания объекта

        this.a = a1; // присвоение переменных, переданных объету, непосредственно объекту
        b = b1; // допустимо и такое написание, но лучше использовать первый вариант
    }

    public int calculateSquare(){ //Публичный метод. Мы можем один раз создать объект, передав переменные,
        // описанные в конструкторе и сотню раз запрашивать площать конкретного прямоугольника, без передачи переменных (которых мы можем и не знать)

        times = a*b;
        return times;
    }

    public static int calculateSquare(int sideA, int sideB){ //Статичный метод. Для вычесление площади мы должны каждый раз передавать ему значения переменных
        times = sideA*sideB;
        return times;

    }


    public static void main(String[] args) {
        Rectangle rectangle_1 = new Rectangle(2,5); //Создаем прямоугольник 1, передавая переменные описанные в конструкторе
        Rectangle rectangle_2 = new Rectangle(3,6); //Создаем прямоугольник 2, передавая переменные описанные в конструкторе

        System.out.println(rectangle_1);

        //System.out.println(rectangle_1.calculateSquare()); //Публичный метод. Просим дать площадь прямоугольника 1, ничего не зная о его сторонах
        //System.out.println(rectangle_2.calculateSquare()); //Публичный метод. Просим дать площадь прямоугольника 2, ничего не зная о его сторонах

        //System.out.println(Rectangle.calculateSquare(25,2)); //Статичный метод. Просим дать площадь прямоугольника, стороны которого нам известны
    }



}
