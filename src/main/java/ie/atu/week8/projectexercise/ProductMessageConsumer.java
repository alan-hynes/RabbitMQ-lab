package ie.atu.week8.projectexercise;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ProductMessageConsumer {

    @RabbitListener(queues = "productQueue")
    public void processProductMessage(Product product) {
        System.out.println("Received message: " + product.toString());
    }
}
