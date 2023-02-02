public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() {

        if (salary > 0 && salary < 1000) {
            return 0;
        } else if (salary > 1000) {
            return (salary * 0.03);
        } else {
            return 0;
        }

    }

    double bonus() {

        if (workHours > 40 && workHours <= 168) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }

    }

    double raiseSalary() {

        if (hireYear<2021 && hireYear>2011){
            return (salary*0.05);
        } else if (hireYear>2010 && hireYear>2001) {
            return (salary*0.10);
        } else if (hireYear<2002) {
            return (salary*0.15);
        }else{
            return 0;
        }

    }
    void print(){

        System.out.println("=========================================");
        System.out.println("Adı Soyadı : "+name);
        System.out.println("Maaşı : "+salary);
        System.out.println("Çalışma Saati : "+workHours);
        System.out.println("Başlangıç Yılı : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş Artışı : "+raiseSalary());
        System.out.println("Vergi Ve Bonuslar İle Birlikte Maaş : "+(bonus()-tax()+salary));
        System.out.println("Toplam Maaş : "+(bonus()+raiseSalary()-tax()+salary));
        System.out.println("==========================================");
    }
}
