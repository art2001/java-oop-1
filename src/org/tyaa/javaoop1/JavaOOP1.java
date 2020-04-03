/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javaoop1;

/**
 *
 * @author yurii
 */
public class JavaOOP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 123;
        int[] xArray = {123, -7, 0, 22};
        
        // Объявили переменную с именем g1 и типом Group,
        // затем присвоили ей объект (экземпляр) типа Group
        Group g1 = new Group();
        // Присваиваем в объект g1 в поле id число 12
        g1.id = 12;
        // Присваиваем в объект g1 в поле number число 1
        g1.number = 1;
        // Присваиваем в объект g1 в поле lit букву А
        g1.lit = 'А';
        // Выводим в консоль все данные об учебном классе (группе) 1А
        System.out.println("Группа " + g1.number + g1.lit + ", id = " + g1.id);
        
        Group g2 = new Group();
        // Присваиваем в объект g2 в поле id число 13
        g2.id = 13;
        // Присваиваем в объект g2 в поле number число 1
        g2.number = 1;
        // Присваиваем в объект g2 в поле lit букву А
        g2.lit = 'Б';
        // Выводим в консоль все данные об учебном классе (группе) 1Б
        System.out.println("Группа " + g2.number + g2.lit + ", id = " + g2.id);
        
        // Задание:
        // 1. создать третью переменную типа Group, присвоив ей новый объект Group,
        // заполнить данными - id = 14, номер = 2, литера = А
        // 2. в поле "lit" ранее созданного объекта g1 перезаписать значение - В,
        // затем вывести все данные этой группы в консоль
        // (выше написанный код работы с группой g1 не менять)
        
        // Демонстрация изменений
        Group g3 = new Group();
        // Присваиваем в объект g2 в поле id число 13
        g3.id = 14;
        // Присваиваем в объект g2 в поле number число 1
        g3.number = 2;
        // Присваиваем в объект g2 в поле lit букву А
        g1.lit = 'B';
        // Выводим в консоль все данные об учебном классе (группе) 1Б
        System.out.println("Группа " + g1.number + g1.lit + ", id = " + g1.id);
    }
    
}
