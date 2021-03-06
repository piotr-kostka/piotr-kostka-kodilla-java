package com.kodilla.good.patterns.challenges.orders;

public class OrderProcessor {

    private InformationService informationService;
    private OrderingService orderingService;
    private OrdersRepository ordersRepository;

    public OrderProcessor(InformationService informationService, OrderingService orderingService, OrdersRepository ordersRepository) {
        this.informationService = informationService;
        this.orderingService = orderingService;
        this.ordersRepository = ordersRepository;
    }

    public OrderDto process(final Order order) {
        boolean isOrdered = orderingService.order(order.getUser(), order.getProductOrder(), order.getOrderDate());

        if (isOrdered) {
            informationService.inform(order.getUser());
            ordersRepository.createOrder(order.getUser(), order.getProductOrder(), order.getOrderDate());
            return new OrderDto(order.getUser(), order.getProductOrder(), true);
        } else {
            return new OrderDto(order.getUser(), order.getProductOrder(), false);
        }
    }
}
