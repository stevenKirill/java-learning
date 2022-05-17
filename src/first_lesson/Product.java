package first_lesson;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

/*
Создать класс Товар, имеющий переменные название, цена.
Создать класс Категория, имеющий переменные название категории и вектор товаров.
Создать класс Basket, содержащий вектор купленных товаров.
Создать класс User, содержащий логин, пароль и объект класса Basket.
Товары и Категории создать в main

Реализовать программу:
---создать обьект класса User
    (Программа должна просить ввести логин и пароль,
    если данные совпадают с логином и паролем из текстовика вывести сообщение:
    ---Наберите "categories", чтобы посмотреть навания категорий
    ---Наберите "watch/<nameOfCategory>" , чтобы посмотреть все названия товаров в категории
    ---Наберите "sortPriceBasket/<nameOfCategory>" , чтобы посмотреть отсортированные по цене товары
    ---Наберите "sortNameBasket/<nameOfCategory>" , чтобы посмотреть отсортированные по названию товары
    ---Наберите "item/<nameOfItem>" , чтобы посмотреть всю информацию о товаре
    ---Наберите "addToBasket/<nameOfCategory>" , чтобы добавить товар в корзину
    ---Наберите "watchBasket/<nameOfCategory>" , чтобы посмотреть товары в корзине
    ---Наберите "buy", чтобы купить товары.
    ---Наберите "exit", чтобы выйти.

    Когда юзер набирает buy:
    ---записать все товары содержащиеся в корзине , в текстовик purchases.txt
    ---Очистить корзину

    Когда юзер набирает exit:
    ---Завершить программу
)
 */
