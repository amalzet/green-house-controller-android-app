package com.nav.greenhousecontoller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class GreenHouseResponse {
    private boolean userAdded;
    private boolean userAlreadyExists;
    private boolean greenHouseIdInUse;
}
