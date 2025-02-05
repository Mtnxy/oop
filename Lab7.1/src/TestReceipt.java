import it.store.utils.receipt.DetailReceipt;
import it.store.utils.receipt.Receipt;
import it.store.utils.receipt.SimpleReceipt;

public class TestReceipt {
    public static void main(String[] args) {

        String[] items ={"WiFi-IP Camera","Power Bank 6000 mAh","Panasonic Battery ขนาด AAA","Adapter DC 12V"};
        double[] prices = {1200,550,65,120};
        Receipt datailReceipt = new DetailReceipt("สมหวัง ใจเลิศ",items,prices);
        datailReceipt.printReceipt();

    }
}
