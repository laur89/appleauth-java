package com.accedia.apple.auth.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AppleUserDataClaim {
    EMAIL("email"),
    EMAIL_VERIFIED("email_verified"),
    AUTHENTICATION_TIME("auth_time");

    private final String claimKey;
}
