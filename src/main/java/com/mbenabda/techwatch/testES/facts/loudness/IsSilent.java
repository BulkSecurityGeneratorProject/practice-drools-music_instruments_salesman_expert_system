package com.mbenabda.techwatch.testES.facts.loudness;

import org.apache.commons.lang3.Validate;

import java.util.Objects;

public class IsSilent {
    private final String instrumentName;

    public IsSilent(final String instrumentName) {
        Validate.notBlank(instrumentName);
        this.instrumentName = instrumentName;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsSilent isSilent = (IsSilent) o;
        return Objects.equals(instrumentName, isSilent.instrumentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrumentName);
    }
}