package jac444b.a2;

import java.util.ArrayList;
import java.util.Locale;
import org.jdesktop.swingx.mapviewer.GeoPosition;

/**
 * @author Clinton Bale
 * @version 1.0
 */
public class Country {

    private String _name;
    private String _code;
    private GeoPosition _location;

    /**
     * 
     * @param code
     * @param name
     * @param location
     */
    public Country(String code, String name, GeoPosition location) {
        this._name = name;
        this._code = code;
        this._location = location;
    }

    /**
     * 
     * @return The name of the country
     */
    public String getName() {
        return _name;
    }

    /**
     * 
     * @return The country code
     */
    public String getCode() {
        return _code;
    }

    /**
     * 
     * @return Location of country
     */
    public GeoPosition getLocation() {
        return _location;
    }

    /**
     * 
     * @return A list of countries
     */
    public static ArrayList<Country> AllCountries() {
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("AD", "Andorra", new GeoPosition(42.5000, 1.5000)));
        countries.add(new Country("AE", "United Arab Emirates", new GeoPosition(24.0000, 54.0000)));
        countries.add(new Country("AF", "Afghanistan", new GeoPosition(33.0000, 65.0000)));
        countries.add(new Country("AG", "Antigua and Barbuda", new GeoPosition(17.0500, -61.8000)));
        countries.add(new Country("AI", "Anguilla", new GeoPosition(18.2500, -63.1667)));
        countries.add(new Country("AL", "Albania", new GeoPosition(41.0000, 20.0000)));
        countries.add(new Country("AM", "Armenia", new GeoPosition(40.0000, 45.0000)));
        countries.add(new Country("AN", "Netherlands Antilles", new GeoPosition(12.2500, -68.7500)));
        countries.add(new Country("AO", "Angola", new GeoPosition(-12.5000, 18.5000)));
        countries.add(new Country("AP", "Afghanistan", new GeoPosition(35.0000, 105.0000)));
        countries.add(new Country("AQ", "Antarctica", new GeoPosition(-90.0000, 0.0000)));
        countries.add(new Country("AR", "Argentina", new GeoPosition(-34.0000, -64.0000)));
        countries.add(new Country("AS", "American Samoa", new GeoPosition(-14.3333, -170.0000)));
        countries.add(new Country("AT", "Austria", new GeoPosition(47.3333, 13.3333)));
        countries.add(new Country("AU", "Australia", new GeoPosition(-27.0000, 133.0000)));
        countries.add(new Country("AW", "Aruba", new GeoPosition(12.5000, -69.9667)));
        countries.add(new Country("AZ", "Azerbaijan", new GeoPosition(40.5000, 47.5000)));
        countries.add(new Country("BA", "Bosnia and Herzegovina", new GeoPosition(44.0000, 18.0000)));
        countries.add(new Country("BB", "Barbados", new GeoPosition(13.1667, -59.5333)));
        countries.add(new Country("BD", "Bangladesh", new GeoPosition(24.0000, 90.0000)));
        countries.add(new Country("BE", "Belgium", new GeoPosition(50.8333, 4.0000)));
        countries.add(new Country("BF", "Burkina Faso", new GeoPosition(13.0000, -2.0000)));
        countries.add(new Country("BG", "Bulgaria", new GeoPosition(43.0000, 25.0000)));
        countries.add(new Country("BH", "Bahrain", new GeoPosition(26.0000, 50.5500)));
        countries.add(new Country("BI", "Burundi", new GeoPosition(-3.5000, 30.0000)));
        countries.add(new Country("BJ", "Benin", new GeoPosition(9.5000, 2.2500)));
        countries.add(new Country("BM", "Bermuda", new GeoPosition(32.3333, -64.7500)));
        countries.add(new Country("BN", "Brunei Darussalam", new GeoPosition(4.5000, 114.6667)));
        countries.add(new Country("BO", "Bolivia", new GeoPosition(-17.0000, -65.0000)));
        countries.add(new Country("BR", "Brazil", new GeoPosition(-10.0000, -55.0000)));
        countries.add(new Country("BS", "Bahamas", new GeoPosition(24.2500, -76.0000)));
        countries.add(new Country("BT", "Bhutan", new GeoPosition(27.5000, 90.5000)));
        countries.add(new Country("BV", "Bouvet Island", new GeoPosition(-54.4333, 3.4000)));
        countries.add(new Country("BW", "Botswana", new GeoPosition(-22.0000, 24.0000)));
        countries.add(new Country("BY", "Belarus", new GeoPosition(53.0000, 28.0000)));
        countries.add(new Country("BZ", "Belize", new GeoPosition(17.2500, -88.7500)));
        countries.add(new Country("CA", "Canada", new GeoPosition(60.0000, -95.0000)));
        countries.add(new Country("CC", "Cocos (Keeling) Islands", new GeoPosition(-12.5000, 96.8333)));
        countries.add(new Country("CD", "Congo, the Democratic Republic of the", new GeoPosition(0.0000, 25.0000)));
        countries.add(new Country("CF", "Central African Republic", new GeoPosition(7.0000, 21.0000)));
        countries.add(new Country("CG", "Congo", new GeoPosition(-1.0000, 15.0000)));
        countries.add(new Country("CH", "Switzerland", new GeoPosition(47.0000, 8.0000)));
        countries.add(new Country("CI", "Cote D'Ivoire", new GeoPosition(8.0000, -5.0000)));
        countries.add(new Country("CK", "Cook Islands", new GeoPosition(-21.2333, -159.7667)));
        countries.add(new Country("CL", "Chile", new GeoPosition(-30.0000, -71.0000)));
        countries.add(new Country("CM", "Cameroon", new GeoPosition(6.0000, 12.0000)));
        countries.add(new Country("CN", "China", new GeoPosition(35.0000, 105.0000)));
        countries.add(new Country("CO", "Colombia", new GeoPosition(4.0000, -72.0000)));
        countries.add(new Country("CR", "Costa Rica", new GeoPosition(10.0000, -84.0000)));
        countries.add(new Country("CU", "Cuba", new GeoPosition(21.5000, -80.0000)));
        countries.add(new Country("CV", "Cape Verde", new GeoPosition(16.0000, -24.0000)));
        countries.add(new Country("CX", "Christmas Island", new GeoPosition(-10.5000, 105.6667)));
        countries.add(new Country("CY", "Cyprus", new GeoPosition(35.0000, 33.0000)));
        countries.add(new Country("CZ", "Czech Republic", new GeoPosition(49.7500, 15.5000)));
        countries.add(new Country("DE", "Germany", new GeoPosition(51.0000, 9.0000)));
        countries.add(new Country("DJ", "Djibouti", new GeoPosition(11.5000, 43.0000)));
        countries.add(new Country("DK", "Denmark", new GeoPosition(56.0000, 10.0000)));
        countries.add(new Country("DM", "Dominica", new GeoPosition(15.4167, -61.3333)));
        countries.add(new Country("DO", "Dominican Republic", new GeoPosition(19.0000, -70.6667)));
        countries.add(new Country("DZ", "Algeria", new GeoPosition(28.0000, 3.0000)));
        countries.add(new Country("EC", "Ecuador", new GeoPosition(-2.0000, -77.5000)));
        countries.add(new Country("EE", "Estonia", new GeoPosition(59.0000, 26.0000)));
        countries.add(new Country("EG", "Egypt", new GeoPosition(27.0000, 30.0000)));
        countries.add(new Country("EH", "Western Sahara", new GeoPosition(24.5000, -13.0000)));
        countries.add(new Country("ER", "Eritrea", new GeoPosition(15.0000, 39.0000)));
        countries.add(new Country("ES", "Spain", new GeoPosition(40.0000, -4.0000)));
        countries.add(new Country("ET", "Ethiopia", new GeoPosition(8.0000, 38.0000)));
        countries.add(new Country("EU", "Afghanistan", new GeoPosition(47.0000, 8.0000)));
        countries.add(new Country("FI", "Finland", new GeoPosition(64.0000, 26.0000)));
        countries.add(new Country("FJ", "Fiji", new GeoPosition(-18.0000, 175.0000)));
        countries.add(new Country("FK", "Falkland Islands (Malvinas)", new GeoPosition(-51.7500, -59.0000)));
        countries.add(new Country("FM", "Micronesia, Federated States of", new GeoPosition(6.9167, 158.2500)));
        countries.add(new Country("FO", "Faroe Islands", new GeoPosition(62.0000, -7.0000)));
        countries.add(new Country("FR", "France", new GeoPosition(46.0000, 2.0000)));
        countries.add(new Country("GA", "Gabon", new GeoPosition(-1.0000, 11.7500)));
        countries.add(new Country("GB", "United Kingdom", new GeoPosition(54.0000, -2.0000)));
        countries.add(new Country("GD", "Grenada", new GeoPosition(12.1167, -61.6667)));
        countries.add(new Country("GE", "Georgia", new GeoPosition(42.0000, 43.5000)));
        countries.add(new Country("GF", "French Guiana", new GeoPosition(4.0000, -53.0000)));
        countries.add(new Country("GH", "Ghana", new GeoPosition(8.0000, -2.0000)));
        countries.add(new Country("GI", "Gibraltar", new GeoPosition(36.1833, -5.3667)));
        countries.add(new Country("GL", "Greenland", new GeoPosition(72.0000, -40.0000)));
        countries.add(new Country("GM", "Gambia", new GeoPosition(13.4667, -16.5667)));
        countries.add(new Country("GN", "Guinea", new GeoPosition(11.0000, -10.0000)));
        countries.add(new Country("GP", "Guadeloupe", new GeoPosition(16.2500, -61.5833)));
        countries.add(new Country("GQ", "Equatorial Guinea", new GeoPosition(2.0000, 10.0000)));
        countries.add(new Country("GR", "Greece", new GeoPosition(39.0000, 22.0000)));
        countries.add(new Country("GS", "South Georgia and the South Sandwich Islands", new GeoPosition(-54.5000, -37.0000)));
        countries.add(new Country("GT", "Guatemala", new GeoPosition(15.5000, -90.2500)));
        countries.add(new Country("GU", "Guam", new GeoPosition(13.4667, 144.7833)));
        countries.add(new Country("GW", "Guinea-Bissau", new GeoPosition(12.0000, -15.0000)));
        countries.add(new Country("GY", "Guyana", new GeoPosition(5.0000, -59.0000)));
        countries.add(new Country("HK", "Hong Kong", new GeoPosition(22.2500, 114.1667)));
        countries.add(new Country("HM", "Heard Island and Mcdonald Islands", new GeoPosition(-53.1000, 72.5167)));
        countries.add(new Country("HN", "Honduras", new GeoPosition(15.0000, -86.5000)));
        countries.add(new Country("HR", "Croatia", new GeoPosition(45.1667, 15.5000)));
        countries.add(new Country("HT", "Haiti", new GeoPosition(19.0000, -72.4167)));
        countries.add(new Country("HU", "Hungary", new GeoPosition(47.0000, 20.0000)));
        countries.add(new Country("ID", "Indonesia", new GeoPosition(-5.0000, 120.0000)));
        countries.add(new Country("IE", "Ireland", new GeoPosition(53.0000, -8.0000)));
        countries.add(new Country("IL", "Israel", new GeoPosition(31.5000, 34.7500)));
        countries.add(new Country("IN", "India", new GeoPosition(20.0000, 77.0000)));
        countries.add(new Country("IO", "British Indian Ocean Territory", new GeoPosition(-6.0000, 71.5000)));
        countries.add(new Country("IQ", "Iraq", new GeoPosition(33.0000, 44.0000)));
        countries.add(new Country("IR", "Iran, Islamic Republic of", new GeoPosition(32.0000, 53.0000)));
        countries.add(new Country("IS", "Iceland", new GeoPosition(65.0000, -18.0000)));
        countries.add(new Country("IT", "Italy", new GeoPosition(42.8333, 12.8333)));
        countries.add(new Country("JM", "Jamaica", new GeoPosition(18.2500, -77.5000)));
        countries.add(new Country("JO", "Jordan", new GeoPosition(31.0000, 36.0000)));
        countries.add(new Country("JP", "Japan", new GeoPosition(36.0000, 138.0000)));
        countries.add(new Country("KE", "Kenya", new GeoPosition(1.0000, 38.0000)));
        countries.add(new Country("KG", "Kyrgyzstan", new GeoPosition(41.0000, 75.0000)));
        countries.add(new Country("KH", "Cambodia", new GeoPosition(13.0000, 105.0000)));
        countries.add(new Country("KI", "Kiribati", new GeoPosition(1.4167, 173.0000)));
        countries.add(new Country("KM", "Comoros", new GeoPosition(-12.1667, 44.2500)));
        countries.add(new Country("KN", "Saint Kitts and Nevis", new GeoPosition(17.3333, -62.7500)));
        countries.add(new Country("KP", "Korea, Democratic People's Republic of", new GeoPosition(40.0000, 127.0000)));
        countries.add(new Country("KR", "Korea, Republic of", new GeoPosition(37.0000, 127.5000)));
        countries.add(new Country("KW", "Kuwait", new GeoPosition(29.3375, 47.6581)));
        countries.add(new Country("KY", "Cayman Islands", new GeoPosition(19.5000, -80.5000)));
        countries.add(new Country("KZ", "Kazakhstan", new GeoPosition(48.0000, 68.0000)));
        countries.add(new Country("LA", "Lao People's Democratic Republic", new GeoPosition(18.0000, 105.0000)));
        countries.add(new Country("LB", "Lebanon", new GeoPosition(33.8333, 35.8333)));
        countries.add(new Country("LC", "Saint Lucia", new GeoPosition(13.8833, -61.1333)));
        countries.add(new Country("LI", "Liechtenstein", new GeoPosition(47.1667, 9.5333)));
        countries.add(new Country("LK", "Sri Lanka", new GeoPosition(7.0000, 81.0000)));
        countries.add(new Country("LR", "Liberia", new GeoPosition(6.5000, -9.5000)));
        countries.add(new Country("LS", "Lesotho", new GeoPosition(-29.5000, 28.5000)));
        countries.add(new Country("LT", "Lithuania", new GeoPosition(56.0000, 24.0000)));
        countries.add(new Country("LU", "Luxembourg", new GeoPosition(49.7500, 6.1667)));
        countries.add(new Country("LV", "Latvia", new GeoPosition(57.0000, 25.0000)));
        countries.add(new Country("LY", "Libyan Arab Jamahiriya", new GeoPosition(25.0000, 17.0000)));
        countries.add(new Country("MA", "Morocco", new GeoPosition(32.0000, -5.0000)));
        countries.add(new Country("MC", "Monaco", new GeoPosition(43.7333, 7.4000)));
        countries.add(new Country("MD", "Moldova, Republic of", new GeoPosition(47.0000, 29.0000)));
        countries.add(new Country("ME", "Afghanistan", new GeoPosition(42.0000, 19.0000)));
        countries.add(new Country("MG", "Madagascar", new GeoPosition(-20.0000, 47.0000)));
        countries.add(new Country("MH", "Marshall Islands", new GeoPosition(9.0000, 168.0000)));
        countries.add(new Country("MK", "Macedonia, the Former Yugoslav Republic of", new GeoPosition(41.8333, 22.0000)));
        countries.add(new Country("ML", "Mali", new GeoPosition(17.0000, -4.0000)));
        countries.add(new Country("MM", "Myanmar", new GeoPosition(22.0000, 98.0000)));
        countries.add(new Country("MN", "Mongolia", new GeoPosition(46.0000, 105.0000)));
        countries.add(new Country("MO", "Macao", new GeoPosition(22.1667, 113.5500)));
        countries.add(new Country("MP", "Northern Mariana Islands", new GeoPosition(15.2000, 145.7500)));
        countries.add(new Country("MQ", "Martinique", new GeoPosition(14.6667, -61.0000)));
        countries.add(new Country("MR", "Mauritania", new GeoPosition(20.0000, -12.0000)));
        countries.add(new Country("MS", "Montserrat", new GeoPosition(16.7500, -62.2000)));
        countries.add(new Country("MT", "Malta", new GeoPosition(35.8333, 14.5833)));
        countries.add(new Country("MU", "Mauritius", new GeoPosition(-20.2833, 57.5500)));
        countries.add(new Country("MV", "Maldives", new GeoPosition(3.2500, 73.0000)));
        countries.add(new Country("MW", "Malawi", new GeoPosition(-13.5000, 34.0000)));
        countries.add(new Country("MX", "Mexico", new GeoPosition(23.0000, -102.0000)));
        countries.add(new Country("MY", "Malaysia", new GeoPosition(2.5000, 112.5000)));
        countries.add(new Country("MZ", "Mozambique", new GeoPosition(-18.2500, 35.0000)));
        countries.add(new Country("NA", "Namibia", new GeoPosition(-22.0000, 17.0000)));
        countries.add(new Country("NC", "New Caledonia", new GeoPosition(-21.5000, 165.5000)));
        countries.add(new Country("NE", "Niger", new GeoPosition(16.0000, 8.0000)));
        countries.add(new Country("NF", "Norfolk Island", new GeoPosition(-29.0333, 167.9500)));
        countries.add(new Country("NG", "Nigeria", new GeoPosition(10.0000, 8.0000)));
        countries.add(new Country("NI", "Nicaragua", new GeoPosition(13.0000, -85.0000)));
        countries.add(new Country("NL", "Netherlands", new GeoPosition(52.5000, 5.7500)));
        countries.add(new Country("NO", "Norway", new GeoPosition(62.0000, 10.0000)));
        countries.add(new Country("NP", "Nepal", new GeoPosition(28.0000, 84.0000)));
        countries.add(new Country("NR", "Nauru", new GeoPosition(-0.5333, 166.9167)));
        countries.add(new Country("NU", "Niue", new GeoPosition(-19.0333, -169.8667)));
        countries.add(new Country("NZ", "New Zealand", new GeoPosition(-41.0000, 174.0000)));
        countries.add(new Country("OM", "Oman", new GeoPosition(21.0000, 57.0000)));
        countries.add(new Country("PA", "Panama", new GeoPosition(9.0000, -80.0000)));
        countries.add(new Country("PE", "Peru", new GeoPosition(-10.0000, -76.0000)));
        countries.add(new Country("PF", "French Polynesia", new GeoPosition(-15.0000, -140.0000)));
        countries.add(new Country("PG", "Papua New Guinea", new GeoPosition(-6.0000, 147.0000)));
        countries.add(new Country("PH", "Philippines", new GeoPosition(13.0000, 122.0000)));
        countries.add(new Country("PK", "Pakistan", new GeoPosition(30.0000, 70.0000)));
        countries.add(new Country("PL", "Poland", new GeoPosition(52.0000, 20.0000)));
        countries.add(new Country("PM", "Saint Pierre and Miquelon", new GeoPosition(46.8333, -56.3333)));
        countries.add(new Country("PR", "Puerto Rico", new GeoPosition(18.2500, -66.5000)));
        countries.add(new Country("PS", "Palestinian Territory, Occupied", new GeoPosition(32.0000, 35.2500)));
        countries.add(new Country("PT", "Portugal", new GeoPosition(39.5000, -8.0000)));
        countries.add(new Country("PW", "Palau", new GeoPosition(7.5000, 134.5000)));
        countries.add(new Country("PY", "Paraguay", new GeoPosition(-23.0000, -58.0000)));
        countries.add(new Country("QA", "Qatar", new GeoPosition(25.5000, 51.2500)));
        countries.add(new Country("RE", "Reunion", new GeoPosition(-21.1000, 55.6000)));
        countries.add(new Country("RO", "Romania", new GeoPosition(46.0000, 25.0000)));
        countries.add(new Country("RS", "Afghanistan", new GeoPosition(44.0000, 21.0000)));
        countries.add(new Country("RU", "Russian Federation", new GeoPosition(60.0000, 100.0000)));
        countries.add(new Country("RW", "Rwanda", new GeoPosition(-2.0000, 30.0000)));
        countries.add(new Country("SA", "Saudi Arabia", new GeoPosition(25.0000, 45.0000)));
        countries.add(new Country("SB", "Solomon Islands", new GeoPosition(-8.0000, 159.0000)));
        countries.add(new Country("SC", "Seychelles", new GeoPosition(-4.5833, 55.6667)));
        countries.add(new Country("SD", "Sudan", new GeoPosition(15.0000, 30.0000)));
        countries.add(new Country("SE", "Sweden", new GeoPosition(62.0000, 15.0000)));
        countries.add(new Country("SG", "Singapore", new GeoPosition(1.3667, 103.8000)));
        countries.add(new Country("SH", "Saint Helena", new GeoPosition(-15.9333, -5.7000)));
        countries.add(new Country("SI", "Slovenia", new GeoPosition(46.0000, 15.0000)));
        countries.add(new Country("SJ", "Svalbard and Jan Mayen", new GeoPosition(78.0000, 20.0000)));
        countries.add(new Country("SK", "Slovakia", new GeoPosition(48.6667, 19.5000)));
        countries.add(new Country("SL", "Sierra Leone", new GeoPosition(8.5000, -11.5000)));
        countries.add(new Country("SM", "San Marino", new GeoPosition(43.7667, 12.4167)));
        countries.add(new Country("SN", "Senegal", new GeoPosition(14.0000, -14.0000)));
        countries.add(new Country("SO", "Somalia", new GeoPosition(10.0000, 49.0000)));
        countries.add(new Country("SR", "Suriname", new GeoPosition(4.0000, -56.0000)));
        countries.add(new Country("ST", "Sao Tome and Principe", new GeoPosition(1.0000, 7.0000)));
        countries.add(new Country("SV", "El Salvador", new GeoPosition(13.8333, -88.9167)));
        countries.add(new Country("SY", "Syrian Arab Republic", new GeoPosition(35.0000, 38.0000)));
        countries.add(new Country("SZ", "Swaziland", new GeoPosition(-26.5000, 31.5000)));
        countries.add(new Country("TC", "Turks and Caicos Islands", new GeoPosition(21.7500, -71.5833)));
        countries.add(new Country("TD", "Chad", new GeoPosition(15.0000, 19.0000)));
        countries.add(new Country("TF", "French Southern Territories", new GeoPosition(-43.0000, 67.0000)));
        countries.add(new Country("TG", "Togo", new GeoPosition(8.0000, 1.1667)));
        countries.add(new Country("TH", "Thailand", new GeoPosition(15.0000, 100.0000)));
        countries.add(new Country("TJ", "Tajikistan", new GeoPosition(39.0000, 71.0000)));
        countries.add(new Country("TK", "Tokelau", new GeoPosition(-9.0000, -172.0000)));
        countries.add(new Country("TM", "Turkmenistan", new GeoPosition(40.0000, 60.0000)));
        countries.add(new Country("TN", "Tunisia", new GeoPosition(34.0000, 9.0000)));
        countries.add(new Country("TO", "Tonga", new GeoPosition(-20.0000, -175.0000)));
        countries.add(new Country("TR", "Turkey", new GeoPosition(39.0000, 35.0000)));
        countries.add(new Country("TT", "Trinidad and Tobago", new GeoPosition(11.0000, -61.0000)));
        countries.add(new Country("TV", "Tuvalu", new GeoPosition(-8.0000, 178.0000)));
        countries.add(new Country("TW", "Taiwan, Province of China", new GeoPosition(23.5000, 121.0000)));
        countries.add(new Country("TZ", "Tanzania, United Republic of", new GeoPosition(-6.0000, 35.0000)));
        countries.add(new Country("UA", "Ukraine", new GeoPosition(49.0000, 32.0000)));
        countries.add(new Country("UG", "Uganda", new GeoPosition(1.0000, 32.0000)));
        countries.add(new Country("UM", "United States Minor Outlying Islands", new GeoPosition(19.2833, 166.6000)));
        countries.add(new Country("US", "United States", new GeoPosition(38.0000, -97.0000)));
        countries.add(new Country("UY", "Uruguay", new GeoPosition(-33.0000, -56.0000)));
        countries.add(new Country("UZ", "Uzbekistan", new GeoPosition(41.0000, 64.0000)));
        countries.add(new Country("VA", "Holy See (Vatican City State)", new GeoPosition(41.9000, 12.4500)));
        countries.add(new Country("VC", "Saint Vincent and the Grenadines", new GeoPosition(13.2500, -61.2000)));
        countries.add(new Country("VE", "Venezuela", new GeoPosition(8.0000, -66.0000)));
        countries.add(new Country("VG", "Virgin Islands, British", new GeoPosition(18.5000, -64.5000)));
        countries.add(new Country("VI", "Virgin Islands, U.s.", new GeoPosition(18.3333, -64.8333)));
        countries.add(new Country("VN", "Viet Nam", new GeoPosition(16.0000, 106.0000)));
        countries.add(new Country("VU", "Vanuatu", new GeoPosition(-16.0000, 167.0000)));
        countries.add(new Country("WF", "Wallis and Futuna", new GeoPosition(-13.3000, -176.2000)));
        countries.add(new Country("WS", "Samoa", new GeoPosition(-13.5833, -172.3333)));
        countries.add(new Country("YE", "Yemen", new GeoPosition(15.0000, 48.0000)));
        countries.add(new Country("YT", "Mayotte", new GeoPosition(-12.8333, 45.1667)));
        countries.add(new Country("ZA", "South Africa", new GeoPosition(-29.0000, 24.0000)));
        countries.add(new Country("ZM", "Zambia", new GeoPosition(-15.0000, 30.0000)));
        countries.add(new Country("ZW", "Zimbabwe", new GeoPosition(-20.0000, 30.0000)));
        return countries;
    }
}
