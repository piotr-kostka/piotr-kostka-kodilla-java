package com.kodilla.good.patterns.food2door;

public class Application {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new SuperbCheapShop());
        orderProcessor.process(order);
    }
}
