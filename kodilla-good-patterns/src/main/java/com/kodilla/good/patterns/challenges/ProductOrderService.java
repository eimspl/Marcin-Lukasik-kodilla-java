package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private MailInformationService mailInformationService;
    private OrderedItems orderedItems;
    private OrderWarehouseService orderWarehouseService;

    public ProductOrderService(final MailInformationService mailInformationService,
                               final OrderedItems orderedItems,
                               final OrderWarehouseService orderWarehouseService) {
        this.mailInformationService = mailInformationService;
        this.orderedItems = orderedItems;
        this.orderWarehouseService = orderWarehouseService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderedItems.buyNow(orderRequest.getUser(), orderRequest.getItem());

        if (isOrdered) {
            mailInformationService.inform(orderRequest.getUser());
            orderWarehouseService.createOrder(orderRequest.getUser(), orderRequest.getItem());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}