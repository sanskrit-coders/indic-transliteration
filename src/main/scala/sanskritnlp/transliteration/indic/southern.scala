package sanskritnlp.transliteration.indic


object kannada extends NativeIndicScript{
  // Unicode chars copied from kn-itrans.mim
  // http://www.koders.com/noncode/fid696F9AB94B6D1DB0A554AFA7D5E5C07F132E6CF9.aspx
  // Links for other languages *-itrans.mim are also found there.

  // ACKNOWLEDGEMENT:
  // The kannaDa table was originally created.
  // Produced using shrI vinod rAjan's
  // akSharamukha service ( http://www.virtualvinodh.com/aksaramukha ).

  override val mapFromDevanagari = Map(
    'अ' -> 'ಅ', 'आ' -> 'ಆ',  'इ' -> 'ಇ', 'ई' -> 'ಈ',
    'उ' -> 'ಉ', 'ऊ' -> 'ಊ',
    'ऋ' -> 'ಋ', 'ॠ' -> 'ೠ', 'ऌ' -> 'ಌ', 'ॡ' -> 'ೡ',
    'ऎ' -> 'ಎ',
    'ए' -> 'ಏ',
    'ऐ' -> 'ಐ',
    'ऒ' -> 'ಒ',
    'ओ' -> 'ಓ', 'औ' -> 'ಔ',
    'ा' -> 'ಾ',
    'ि' -> 'ಿ',
    'ी' -> 'ೀ',
    'ु' -> 'ು', 'ू' -> 'ೂ',
    'ृ' -> 'ೃ', 'ॄ' -> 'ೄ',
    'ॢ' -> 'ೢ', 'ॣ' -> 'ೣ',
    'ॆ' -> 'ೆ',
    'े' -> 'ೇ',
    'ै' ->  'ೈ',
    'ॊ' -> 'ೊ',
    'ो' -> 'ೋ',  'ौ' -> 'ೌ',
    'ह' -> 'ಹ', 'य' -> 'ಯ', 'व' -> 'ವ', 'र' -> 'ರ', 'ल' -> 'ಲ',
    'ञ' -> 'ಞ',
    'ङ' -> 'ಙ',
    'म' -> 'ಮ',
    'ण' -> 'ಣ',
    'न' -> 'ನ',
    'झ' -> 'ಝ', 'भ' -> 'ಭ',
    'घ' -> 'ಘ', 'ढ' -> 'ಢ', 'ध' -> 'ಧ',
    'ज' -> 'ಜ', 'ब' -> 'ಬ', 'ग' -> 'ಗ',
    'ड' -> 'ಡ', 'द' -> 'ದ',
    'ख' -> 'ಖ',
    'फ' -> 'ಫ', 'छ' -> 'ಛ', 'ठ' -> 'ಠ',
    'थ' -> 'ಥ', 'च' -> 'ಚ', 'ट' -> 'ಟ', 'त' -> 'ತ',
    'क' -> 'ಕ', 'प' -> 'ಪ',
    'श' -> 'ಶ', 'ष' -> 'ಷ', 'स' -> 'ಸ',
    'ळ' -> 'ಳ', '्' -> '್', 'ं' -> 'ಂ',  'ः' -> 'ಃ', 'ँ' -> 'ಁ',
    'ऽ' -> 'ಽ', '़' -> '಼',
    '०' -> '೦', '१'-> '೧', '२'-> '೨',
    '३'-> '೩', '४'-> '೪', '५'-> '೫',
    '६'-> '೬', '७'-> '೭', '८'-> '೮', '९'-> '೯'
  )

  override val mapToDevanagari: Map[Char, Char] = mapFromDevanagari.map(_.swap)
  override val distinctCharacters: Set[Char] = mapToDevanagari.keys.filterNot(x => mapFromDevanagari.keys.toList.contains(x)).toSet


}

object telugu extends NativeIndicScript{
  // Produced using shrI vinod rAjan's
  // akSharamukha service ( http://www.virtualvinodh.com/aksaramukha ).
  // Refer to https://en.wikipedia.org/wiki/Telugu_(Unicode_block)

  // We just use the kannada L and LL glyphs.

  override val mapFromDevanagari = Map(
    'अ' -> 'అ', 'आ' -> 'ఆ',  'इ' -> 'ఇ', 'ई' -> 'ఈ',
    'उ' -> 'ఉ', 'ऊ' -> 'ఊ',
    'ऋ' -> 'ఋ', 'ॠ' -> 'ౠ', 'ऌ' -> 'ఌ', 'ॡ' -> 'ఌ',
    'ऎ' -> 'ఎ',
    'ए' -> 'ఏ',
    'ऐ' -> 'ఐ',
    'ऒ' -> 'ఒ',
    'ओ' -> 'ఓ', 'औ' -> 'ఔ',
    'ा' -> 'ా',
    'ि' -> 'ి',
    'ी' -> 'ీ',
    'ु' -> 'ు', 'ू' -> 'ూ',
    'ृ' -> 'ృ', 'ॄ' -> 'ౄ', 'ॣ' -> 'ೄ',
    'ॢ' -> 'ೄ', 'ॆ' -> 'ె',
    'े' -> 'ే',
    'ै' ->  'ై',
    'ॊ' -> 'ొ',
    'ो' -> 'ో',  'ौ' -> 'ౌ',
    'ह' -> 'హ', 'य' -> 'య', 'व' -> 'వ', 'र' -> 'ర', 'ल' -> 'ల',
    'ञ' -> 'ఞ',
    'ङ' -> 'ఙ',
    'म' -> 'మ',
    'ण' -> 'ణ',
    'न' -> 'న',
    'झ' -> 'ఝ', 'भ' -> 'భ',
    'घ' -> 'ఘ', 'ढ' -> 'ఢ', 'ध' -> 'ధ',
    'ज' -> 'జ', 'ब' -> 'బ', 'ग' -> 'గ',
    'ड' -> 'డ', 'द' -> 'ద',
    'ख' -> 'ఖ',
    'फ' -> 'ఫ', 'छ' -> 'ఛ', 'ठ' -> 'ఠ',
    'थ' -> 'థ', 'च' -> 'చ', 'ट' -> 'ట', 'त' -> 'త',
    'क' -> 'క', 'प' -> 'ప',
    'श' -> 'శ', 'ष' -> 'ష', 'स' -> 'స',
    'ळ' -> 'ళ', '्' -> '్', 'ं' -> 'ం',  'ः' -> 'ః',
    'ऽ' -> 'ఽ',
    // '़' -> '़', No Nukta
    'ँ' -> 'ఁ',
    '०' -> '౦', '१'-> '౧', '२'-> '౨',
    '३'-> '౩', '४'-> '౪', '५'-> '౫',
    '६'-> '౬', '७'-> '౭', '८'-> '౮', '९'-> '౯'
  )

  override val mapToDevanagari: Map[Char, Char] = mapFromDevanagari.map(_.swap)
  override val distinctCharacters: Set[Char] = mapToDevanagari.keys.filterNot(x => mapFromDevanagari.keys.toList.contains(x)).toSet
}


object malayalam extends NativeIndicScript{
  // https://en.wikipedia.org/wiki/Malayalam_(Unicode_block)
  override val mapFromDevanagari = Map(
    'अ' -> 'അ', 'आ' -> 'ആ',  'इ' -> 'ഇ', 'ई' -> 'ഈ',
    'उ' -> 'ഉ', 'ऊ' -> 'ഊ',
    'ऋ' -> 'ഋ', 'ॠ' -> 'ൠ', 'ऌ' -> 'ഌ', 'ॡ' -> 'ൡ',
    'ऎ' -> 'എ',
    'ए' -> 'ഏ',
    'ऐ' -> 'ഐ',
    'ऒ' -> 'ഒ',
    'ओ' -> 'ഓ', 'औ' -> 'ഔ',
    'ा' -> 'ാ',
    'ि' -> 'ി',
    'ी' -> 'ീ',
    'ु' -> 'ു', 'ू' -> 'ൂ',
    'ृ' -> 'ൃ', 'ॄ' -> 'ൄ',
    'ॢ' -> 'ൢ', 'ॣ' -> 'ൣ',
    'ॆ' -> 'െ',
    'े' -> 'േ',
    'ै' ->  'ൊ',
    'ॊ' -> 'ൈ',
    'ो' -> 'ോ',  'ौ' -> 'ൌ',
    'ह' -> 'ഹ', 'य' -> 'യ', 'व' -> 'വ', 'र' -> 'ര', 'ल' -> 'ല',
    'ञ' -> 'ഞ',
    'ङ' -> 'ങ',
    'म' -> 'മ',
    'ण' -> 'ണ',
    'न' -> 'ന',
    'झ' -> 'ഝ', 'भ' -> 'ഭ',
    'घ' -> 'ഘ', 'ढ' -> 'ഢ', 'ध' -> 'ധ',
    'ज' -> 'ജ', 'ब' -> 'ബ', 'ग' -> 'ഗ',
    'ड' -> 'ഡ', 'द' -> 'ദ',
    'ख' -> 'ഖ',
    'फ' -> 'ഫ', 'छ' -> 'ഛ', 'ठ' -> 'ഠ',
    'थ' -> 'ഥ', 'च' -> 'ച', 'ट' -> 'ട', 'त' -> 'ത',
    'क' -> 'ക', 'प' -> 'പ',
    'श' -> 'ശ', 'ष' -> 'ഷ', 'स' -> 'സ',
    'ळ' -> 'ള', '्' -> '്', 'ं' -> 'ം',  'ः' -> 'ഃ', 'ँ' -> 'ഁ',
    'ऽ' -> 'ഽ',
    '०' -> '൦', '१'-> '൧', '२'-> '൨',
    '३'-> '൩', '४'-> '൪', '५'-> '൫',
    '६'-> '൬', '७'-> '൭', '८'-> '൮', '९'-> '൯'
  )

  override val mapToDevanagari: Map[Char, Char] = mapFromDevanagari.map(_.swap)
  override val distinctCharacters: Set[Char] =mapToDevanagari.keys.filterNot(x => mapFromDevanagari.keys.toList.contains(x)).toSet
}