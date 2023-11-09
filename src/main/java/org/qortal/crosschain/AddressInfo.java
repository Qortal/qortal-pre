package org.qortal.crosschain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;
import java.util.Objects;

/**
 * Class AddressInfo
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressInfo {

    private String address;

    private List<Integer> path;

    private long value;

    private String pathAsString;

    private int transactionCount;

    public AddressInfo() {
    }

    public AddressInfo(String address, List<Integer> path, long value, String pathAsString, int transactionCount) {
        this.address = address;
        this.path = path;
        this.value = value;
        this.pathAsString = pathAsString;
        this.transactionCount = transactionCount;
    }

    public String getAddress() {
        return address;
    }

    public List<Integer> getPath() {
        return path;
    }

    public long getValue() {
        return value;
    }

    public String getPathAsString() {
        return pathAsString;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressInfo that = (AddressInfo) o;
        return value == that.value && transactionCount == that.transactionCount && Objects.equals(address, that.address) && Objects.equals(path, that.path) && Objects.equals(pathAsString, that.pathAsString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, path, value, pathAsString, transactionCount);
    }

    @Override
    public String toString() {
        return "AddressInfo{" +
                "address='" + address + '\'' +
                ", path=" + path +
                ", value=" + value +
                ", pathAsString='" + pathAsString + '\'' +
                ", transactionCount=" + transactionCount +
                '}';
    }
}
