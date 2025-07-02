package src;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TicketBooking {
    public static void main(String[] args) {
        int numberOfBookings = 5;
        int threadPoolSize = 3;

        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);

        for (int i = 1; i <= numberOfBookings ; i++) {
            TicketBookingThread thread = new TicketBookingThread(i);
            executorService.execute(thread);
        }

        executorService.shutdown();
    }
}

class TicketBookingThread implements Runnable {
    private final int bookingId;

    public TicketBookingThread(int bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public void run() {
        System.out.println("Booking received for BookingId " + bookingId);

        try {
            Thread.sleep(500);
            System.out.println("Payment processed for BookingId " + bookingId);
            Thread.sleep(500);
            System.out.println("Ticket confirmed for BookingId " + bookingId);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}