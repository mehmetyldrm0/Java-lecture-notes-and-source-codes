package com.burakmaral.source;

import org.csystem.parser.ISource;

public class StringSource implements ISource {
    private final String m_str;
    private int m_index;

    public StringSource(String str)
    {
        m_str = str;
    }

    public int nextChar()
    {
        return m_index == m_str.length() ? -1 : m_str.charAt(m_index++);
    }
}
