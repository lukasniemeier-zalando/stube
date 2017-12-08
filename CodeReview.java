package code_review;

import javax.annotation.concurrent.Immutable;
import java.util.List;

@Immutable
public class CodeReview implements Comparable<CodeReview> {

    private int m_id;
    private String m_type;
    private String m_name;
    private List m_keys;

    public CodeReview(final int id, final String type, final String name, final List keys) {
        this.m_id = m_id;
        this.m_type = m_type;
        this.m_name = m_name;
        this.m_keys = m_keys;
    }

    public int getId() {
        return m_id;
    }

    public String getType() {
        return m_type;
    }

    public String getName() {
        return m_name;
    }

    public List getM_keys() {
        return m_keys;
    }

    public boolean equals(final CodeReview other) {

        return m_id == other.m_id && m_name.equals(other.m_name);
    }

    public int hashCode() {
        return (m_id * 31 + m_type.hashCode()) * 31 + m_name.hashCode();
    }

    @Override
    public int compareTo(CodeReview o) {
        return getName().compareTo(o.getName());
    }

}
