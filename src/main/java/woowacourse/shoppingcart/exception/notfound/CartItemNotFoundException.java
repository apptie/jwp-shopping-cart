package woowacourse.shoppingcart.exception.notfound;

public class CartItemNotFoundException extends NotFoundException {
    public CartItemNotFoundException() {
        super("장바구니 품목을 찾을 수 없습니다.");
    }
}