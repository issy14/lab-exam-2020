import MeCab


def print_words_and_results(raw_text: str = 'すもももももももものうち'):
    t = MeCab.Tagger('')
    print(t.parse(raw_text))


def print_morpheme(raw_text: str = 'すもももももももものうち'):
    t = MeCab.Tagger('')
    print(t.parse(''))
    m = t.parseToNode(raw_text)

    keywords = []

    while m:
        if m.feature.split(',')[0] == '名詞':
            keywords.append(m.surface)
        m = m.next

    print(keywords)


if __name__ == '__main__':
    a = 'すもももももももものうち'
    print_words_and_results(a)
    print_morpheme(a)
