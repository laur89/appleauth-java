package com.accedia.apple.auth;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AppleUserScope {
    EMAIL("email"),
    NAME("name");

    private final String literal;
}
