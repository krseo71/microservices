package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @Schema(
            description = "Account Number of Easy Bank account", example = "3454433243"
    )
    private Long accountNumber;

    @NotEmpty(message = "accountType can not be a null or empty")
    @Schema(
            description = "Account type of Easy Bank account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "branchAddress can not be a null or empty")
    @Schema(
            description = "Easy Bank branch address", example = "bangbaero 2gil"
    )
    private String branchAddress;
}
