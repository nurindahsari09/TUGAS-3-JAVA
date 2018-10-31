public class mainQueueGeneric{
public static void main(String[] args){

    QueueGeneric <String> QGT = new QueueGeneric<String>();
    QGT.insert("ONE");
    QGT.insert("TWO");
    QGT.insert("THREE");
    
    System.out.println("HASIL QUEUE TIPE GENERIC :");
    System.out.println(QGT.remove());
    System.out.println(QGT.remove());
    System.out.println(QGT.remove());
    System.out.println(QGT.remove());
}

}