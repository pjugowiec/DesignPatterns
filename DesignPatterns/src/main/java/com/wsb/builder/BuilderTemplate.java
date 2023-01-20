package com.wsb.builder;

public class BuilderTemplate {

    private final long userId;
    private final String userName;
    private final String password;
    private final String email;

    private BuilderTemplate(final Builder builder) {

        this.userId = builder.userId;
        this.userName = builder.userName;
        this.password = builder.password;
        this.email = builder.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private long userId;
        private String userName;
        private String password;
        private String email;

        public Builder userId(final long userId) {
            this.userId = userId;
            return this;
        }

        public Builder userName(final String userName) {
            this.userName = userName;
            return this;
        }

        public Builder password(final String password) {
            this.password = password;
            return this;
        }

        public Builder email(final String email) {
            this.email = email;
            return this;
        }

        public BuilderTemplate build() {
            return new BuilderTemplate(this);
        }
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
