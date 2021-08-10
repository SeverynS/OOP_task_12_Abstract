package com;
/*
2) Пусть у вас есть класс User, а от него наследуют классы Employee и Student.
При этом предполагается, что вы будете создавать объекты классов Employee и Student, но объекты класса User —
не будете, так как сам класс User используется только для группировки общих свойств и методов своих наследников.
В этом случае можно принудительно запретить создавать объекты класса User, чтобы вы или другой программист
где-нибудь их случайно не создали.
Для этого существуют так называемые абстрактные классы. Продемонстрируйте иерархию для этой задачи в коде
*/

import com.models.users.Employee;
import com.models.users.Student;
import com.models.users.User;

public class Task2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Student student = new Student();
        //User user = new User(); невозможно создать объект абстрактного класса
    }
}
