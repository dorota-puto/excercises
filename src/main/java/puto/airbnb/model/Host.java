package puto.airbnb.model;

import java.util.Objects;

public class Host {

    private final Integer hostId;
    private final String hostName;

    public Host(Integer hostId, String hostName) {
        this.hostId = hostId;
        this.hostName = hostName;
    }

    public Integer getHostId() {
        return hostId;
    }

    public String getHostName() {
        return hostName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Host host = (Host) o;
        return getHostId().equals(host.getHostId()) &&
                getHostName().equals(host.getHostName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHostId(), getHostName());
    }

    @Override
    public String toString() {
        return "host id = " + hostId + " host name= " + hostName;
    }
}
