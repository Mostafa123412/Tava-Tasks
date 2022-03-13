package com.company;

//الاسم / مصطفي اشرف محمد سعد الصعيدي
//سكشن / 4

public class Assignment {

    private double mark = -1;

    public double getMark() throws NotYetSetException {
        if (mark == -1) {

            System.out.println("Mark is not yet set");
        }
        return mark;
    }

    public void setMark(int m) {
        mark = m;
    }
}
