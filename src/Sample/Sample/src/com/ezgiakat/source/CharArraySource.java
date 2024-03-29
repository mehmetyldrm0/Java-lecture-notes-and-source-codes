package com.ezgiakat.source;

import org.csystem.parser.ISource;

public class CharArraySource implements ISource {
    private final char [] m_chars;
    private int m_index;

    public CharArraySource(String str)
    {
        m_chars = str.toCharArray();
    }

    public int nextChar()
    {
        return m_index == m_chars.length ? -1 : m_chars[m_index++];
    }
}
