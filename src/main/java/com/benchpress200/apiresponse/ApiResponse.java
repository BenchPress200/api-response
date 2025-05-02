package com.benchpress200.apiresponse;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ApiResponse {
    public static <T> ResponseBody<T> builder() {
        return new ResponseBody<>();
    }

    public static class ResponseBody <T> {
        private HttpStatus httpStatus;
        private int status;
        private String message;
        private T data;
        private ZonedDateTime timestamp;

        private ResponseBody() {}

        public ResponseBody<T> status(final HttpStatus httpStatus) {
            this.httpStatus = httpStatus;
            this.status = httpStatus.value();
            return this;
        }

        public ResponseBody<T> data(final T data) {
            this.data = data;
            return this;
        }

        public ResponseBody<T> message(final String message) {
            this.message = message;
            return this;
        }

        public ResponseEntity<ResponseBody<T>> build() {
            this.timestamp = ZonedDateTime.now(ZoneOffset.UTC);
            return ResponseEntity.status(httpStatus).body(this);
        }

        public int getStatus() {
            return status;
        }

        public T getData() {
            return data;
        }

        public String getMessage() {
            return message;
        }

        public ZonedDateTime getTimestamp() {
            return timestamp;
        }
    }
}

