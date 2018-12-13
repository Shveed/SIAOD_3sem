#include "countsystem.h"

CountSystem::CountSystem()
{

}

CountSystem::CountSystem(QString Line, int Sys1, int Sys2)
{
    this->line = Line;
    this->sys1 = Sys1;
    this->sys2 = Sys2;
}
/*
int CountSystem::Convert_to_Int(char c){
    switch(c){
        case 'A':
            return 10;
        case 'B':
            return 11;
        case 'C':
            return 12;
        case 'D':
            return 13;
        case 'E':
            return 14;
        case 'F':
            return 15;
    default:
        return (int)c;

    }
}

char CountSystem::Convert_to_Char(int c){
    switch(c){
    case 10:
        return 'A';
    case 11:
        return 'B';
    case 12:
        return 'C';
    case 13:
        return 'D';
    case 14:
        return 'E';
    case 15:
        return 'F';
    default:
        return (char)c;
    }
}

int CountSystem::fromQto10(QString q, int q_system){
    int curr = 0;
    int n = (int)q.length();
    for(int i = 0; i < n; i++){
        curr += Convert_to_Int(q.at(i).toLatin1()) * pow(q_system, n - i - 1);
    }
    return curr;
}

QString CountSystem::from10toQ(QString q, int q_system){
    QString curr = "";
    while(q.toInt() != 0){                                        // пока числовое значение строки не равно нулю
        curr = Convert_to_Char(q.toInt() % q_system ) + curr;     // остаток от деления записываем в начало строки curr
        q = QString(q.toInt() / q_system);                        // значение числа делим на значение системы счисления
    }
    return q;
}

bool CountSystem::Is_Line_Allowed(int s1, QString l1){
    for(int i=0; i<l1.length(); i++){
        QChar symbol = l1.at(i);
        if (!(CountSystem::Convert_to_Int(symbol.toLatin1()) < s1)){
            return false;
        }
    }
    return true;
}

*/







