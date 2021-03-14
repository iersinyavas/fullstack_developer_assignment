package com.linktera.linkteraquiz.common;

public class GeneralEnum {

    public enum BookStatus{

        RENT(true), NOT_RENT(false);

        private boolean value;

        public boolean value() {
            return value;
        }

        BookStatus(boolean value) {
            this.value = value;
        }
    }
}
