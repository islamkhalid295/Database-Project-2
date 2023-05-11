/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orm;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Islam
 */
public class ORM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("ORMPU").createEntityManager();
        em.getTransaction().begin();
        List<Car> allCar = em.createNamedQuery("Car.findAll").getResultList();
        List<SalespersonHasCar> allSHC = em.createNamedQuery("SalespersonHasCar.findAll").getResultList();
        
        
//1-Display the serial number and the price of the Toyota corolla. 
//System.out.format("%11s,%11s\n","Serial_num","price");
//        for(Car c : allCar){
//            if(c.getManufacture().equalsIgnoreCase("Toyota")&&c.getModel().equalsIgnoreCase("Corolla "))
//                System.out.format("%11s,%11s\n",c.getSerialNo(),c.getPrice());
//                    
//        }


// 2-Retrieve a model and price of each car whose has price between 150000 and 250000.
//System.out.format("%8s,%11s\n","model","price");
//        for(Car c : allCar){
//            if(c.getPrice()<250000 && c.getPrice()>150000)
//                System.out.format("%8s,%11s\n",c.getModel(),c.getPrice());
//                    
//        }


        
        
// 3-Retrieve a model, price, and price after adding 7% interest of all cars ordered from the most expensive car to the cheapest car. 
//System.out.format("%8s,%11s,%11s\n","model","price","price + 7%");
//List<Car> allCarDesc = em.createNamedQuery("Car.findAllDesc").getResultList();
//for(Car c : allCarDesc){
//            for(SalespersonHasCar s: allSHC){
//                if(c.getSerialNo()==s.getsalespersonHasCarPK().getCarserialNo()){
//                    
//                    System.out.format("%8s,%11s,%11s\n",c.getModel(),
//                    c.getPrice(),c.getPrice()*1.07);
//                    
//                    break;
//                }
//
//            }
//        }
            
     
/* 4-Make a report named report1 (view) that contains car model, car manufacturer, car price, option name, option price 
and the total price of the car with each of its option.   
------------------
create view done in orm package
SQL Command
SELECT  Model ,  Manufacture ,  name  as option_name,  car . price  As car_price , option_car . price  As option_price 
, car . price + option_car . price  as total_price FROM  mydb . option_car  ,  mydb . car 
where  car_serialNo  =  serialNo 
------------------*/
//List<Report1> allR1 = em.createNamedQuery("Report1.findAll").getResultList();
//System.out.format("%8s,%13s,%11s,%15s,%13s,%11s\n","model","manufacturer","price","option name","option price","total price of the car with each of its option");
//for(Report1 r : allR1 ){
//    System.out.format("%8s,%13s,%11s,%15s,%13s,%15s\n",r.getModel(),r.getManufacture(),r.getCarPrice(),r.getOptionName(),r.getOptionPrice(),r.getTotalPrice());
//   }


// 5-For each car model, display the total prices of its options.
//List<Report1> allR1 = em.createNamedQuery("Report1.findAll").getResultList();
//int m1=0;int m2=0;int m3=0;
//        for(Report1 r : allR1){           
//                if(null!=r.getModel())
//                    switch (r.getModel()) {
//                case "Corolla ":
//                    m1 += r.getOptionPrice();
//                    break;
//                case "C200":
//                    m2 += r.getOptionPrice();
//                    break;
//                case "Lancer ":
//                    m3 += r.getOptionPrice();
//                    break;
//                default:
//                    break;
//            }
//        }
//        System.out.format("%8s,%11s\n","model","Total_OptionPrice");
//        System.out.format("%8s,%11s\n","Corolla",m1);
//        System.out.format("%8s,%11s\n","C200",m2);
//        System.out.format("%8s,%11s\n","Lancer",m3);

        
        
// 6-Retrieve the name and phone of salesperson whose name start with “s”.     
//System.out.format("%15s,%11s\n","name","phone");
//       List<Salesperson> allsp = em.createNamedQuery("Salesperson.findAll").getResultList();
//       for(Salesperson s : allsp){
//           if(s.getName().charAt(0)=='S')
//               System.out.format("%15s,%11s\n",s.getName(),s.getPhone());
//               
//       }
   

// 7-Retrieve the name of salesperson who has no phone. 
//List<Salesperson> allsp = em.createNamedQuery("Salesperson.findAll").getResultList();
//System.out.format("%11s,%11s\n","name","phone");
//       for(Salesperson s : allsp){
//           if(s.getPhone()==null)
//               System.out.format("%8s,%11s\n",s.getName(),s.getPhone());
//       }


/* 8-Make a report named report2 (view) that contains each car sales details 
(car model, car price, salesperson name, sales date, and sales price) 
-------------
create view done in orm package
SQL Command
SELECT  Model , car . price , salesperson . name , salesperson_has_car . date , salesperson_has_car . saleprice  
FROM  car , salesperson , salesperson_has_car 
where  car_serialNo  = serialNo  and  salesperson_id  =  id 
---------------*/
//List<Report2> allr2 = em.createNamedQuery("Report2.findAll").getResultList();
//System.out.format("%8s,%11s,%18s,%30s,%12s\n","model","price","salesperson name","sales date","sales price");
//for(Report2 r : allr2 ){
//    System.out.format("%8s,%11s,%18s,%30s,%12s\n",r.getModel(),r.getPrice(),r.getName(),r.getDate(),r.getSaleprice());
//   }


// 9 -For each salesperson, display the number of cars that he sold and summation of their prices.
//System.out.format("%15s,%8s,%10s\n","name","num_car","Total_price");
//        List<Report2> allr2 = em.createNamedQuery("Report2.findAll").getResultList();
//        int m1=0;int m2=0;int m3=0;int c1=0;int c2=0;int c3=0;
//        for(Report2 s : allr2){            
//                if(null!=s.getName())
//                    switch (s.getName()) {
//                case "Sayed Hussein":
//                    m1 += s.getSaleprice();
//                    c1 ++;
//                    break;
//                case "Samir Ayob":
//                    m2 += s.getSaleprice();
//                    c2 ++;
//                    break;
//                case "Nader Galal":
//                    m3 += s.getSaleprice();
//                    c3 ++;
//                    break;
//                default:
//                    break;
//            }
//        }
//        System.out.format("%15s,%8s,%7s\n","Sayed Hussein",c1,m1);
//        System.out.format("%15s,%8s,%7s\n","Samir Ayob",c2,m2);
//        System.out.format("%15s,%8s,%7s\n","Nader Galal",c3,m3);





//10-⦁Display the details of the cheapest car(s).
{
float min=999999999;
Car c1=null;
        for(Car c : allCar){
            if(c.getPrice()<min){
                min=c.getPrice();
                c1=c;
            }         
        }    
System.out.println("the cheapest car is "+c1.toString());
}
}
    }
    

