package woowacourse.shoppingcart.dto;

public class DuplicateResponse {

    private boolean isDuplicate;

    private DuplicateResponse() {
    }

    public DuplicateResponse(final boolean isDuplicate) {
        this.isDuplicate = isDuplicate;
    }

    public boolean getIsDuplicate() {
        return isDuplicate;
    }
}