import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Tabela {

    private Copa copa = new Copa();
    private JTabbedPane TabbedPanel;
    private JPanel GrupoA;
    private JPanel GrupoB;
    private JPanel GrupoC;
    private JPanel GrupoD;
    private JPanel GrupoE;
    private JPanel GrupoF;
    private JPanel GrupoG;
    private JPanel GrupoH;
    private JTextField CatarGolsXEquador;
    private JTextField EquadorGolsXCatar;
    private JTextField SenegalGolsXHolanda;
    private JTextField HolandaGolsXSenegal;
    private JTextField CatarGolsXSenegal;
    private JTextField SenegalGolsXCatar;
    private JTextField HolandaGolsXEquador;
    private JTextField EquadorGolsXHolanda;
    private JTextField EquadorGolsXSenegal;
    private JTextField SenegalGolsXEquador;
    private JTextField HolandaGolsXCatar;

    private JTextField CatarGolsXHolanda;

    private JTextField[] GrupoATexts = new JTextField[]{CatarGolsXEquador, EquadorGolsXCatar, SenegalGolsXHolanda, HolandaGolsXSenegal, CatarGolsXSenegal, SenegalGolsXCatar, HolandaGolsXEquador, EquadorGolsXHolanda, EquadorGolsXSenegal, SenegalGolsXEquador, HolandaGolsXCatar, CatarGolsXHolanda};
    private Time[] GrupoATimes = new Time[]{copa.getQatar(), copa.getEcuador(), copa.getSenegal(), copa.getNetherlands()};

    private JTextField InglaterraGolsXIra;
    private JTextField IraGolsXInglaterra;
    private JTextField GalesGolsXEstadosUnidos;
    private JTextField EstadosUnidosGolsXGales;
    private JTextField GalesGolsXIra;
    private JTextField IraGolsXGales;
    private JTextField InglaterraGolsXEstadosUnidos;
    private JTextField EstadosUnidosGolsXInglaterra;
    private JTextField IraGolsXEstadosUnidos;
    private JTextField EstadosUnidosGolsXIra;
    private JTextField GalesGolsXInglaterra;
    private JTextField InglaterraGolsXGales;

    private JTextField[] GrupoBTexts = new JTextField[]{InglaterraGolsXIra, IraGolsXInglaterra, GalesGolsXEstadosUnidos, EstadosUnidosGolsXGales, GalesGolsXIra, IraGolsXGales, InglaterraGolsXEstadosUnidos, EstadosUnidosGolsXInglaterra, IraGolsXEstadosUnidos, EstadosUnidosGolsXIra, GalesGolsXInglaterra, InglaterraGolsXGales};

    private Time[] GrupoBTimes = new Time[]{copa.getEngland(), copa.getUsa(), copa.getIran(), copa.getWales()};

    private JTextField ArgentinaGolsXArabia;
    private JTextField ArabiaGolsXArgentina;
    private JTextField MexicoGolsXPolonia;
    private JTextField PoloniaGolsXMexico;
    private JTextField PoloniaGolsXArabia;
    private JTextField ArabiaGolsXPolonia;
    private JTextField ArgentinaGolsXMexico;
    private JTextField MexicoGolsXArgentina;
    private JTextField PoloniaGolsXArgentina;
    private JTextField ArgentinaGolsXPolonia;
    private JTextField ArabiaGolsXMexico;
    private JTextField MexicoGolsXArabia;

    private JTextField[] GrupoCTexts = new JTextField[]{ArgentinaGolsXArabia, ArabiaGolsXArgentina, MexicoGolsXPolonia, PoloniaGolsXMexico, PoloniaGolsXArabia, ArabiaGolsXPolonia, ArgentinaGolsXMexico, MexicoGolsXArgentina, PoloniaGolsXArgentina, ArgentinaGolsXPolonia, ArabiaGolsXMexico, MexicoGolsXArabia};

    private Time[] GrupoCTimes = new Time[]{copa.getArgentina(), copa.getPoland(), copa.getMexico(), copa.getArabia()};

    private JTextField AlemanhaGolsXJapao;
    private JTextField JapaoGolsXAlemanha;
    private JTextField EspanhaGolsXCostaRica;
    private JTextField CostaRicaGolsXEspanha;
    private JTextField JapaoGolsXCostaRica;
    private JTextField CostaRicaGolsXJapao;
    private JTextField EspanhaGolsXAlemanha;
    private JTextField AlemanhaGolsXEspanha;
    private JTextField JapaoGolsXEspanha;
    private JTextField EspanhaGolsXJapao;
    private JTextField CostaRicaGolsXAlemanha;
    private JTextField AlemanhaGolsXCostaRica;

    private JTextField[] GrupoETexts = new JTextField[]{AlemanhaGolsXJapao, JapaoGolsXAlemanha, EspanhaGolsXCostaRica, CostaRicaGolsXEspanha, JapaoGolsXCostaRica, CostaRicaGolsXJapao, EspanhaGolsXAlemanha, AlemanhaGolsXEspanha, JapaoGolsXEspanha, EspanhaGolsXJapao, CostaRicaGolsXAlemanha, AlemanhaGolsXCostaRica};

    private Time[] GrupoETimes = new Time[]{copa.getJapan(), copa.getSpain(), copa.getGermany(), copa.getCostarica()};

    private JTextField MarrocosGolsXCroacia;
    private JTextField CroaciaGolsXMarrocos;
    private JTextField BelgicaGolsXCanada;
    private JTextField CanadaGolsXBelgica;
    private JTextField BelgicaGolsXMarrocos;
    private JTextField MarrocosGolsXBelgica;
    private JTextField CroaciaGolsXCanada;
    private JTextField CanadaGolsXCroacia;
    private JTextField CanadaGolsXMarrocos;
    private JTextField MarrocosGolsXCanada;
    private JTextField CroaciaGolsXBelgica;
    private JTextField BelgicaGolsXCroacia;

    private JTextField[] GrupoFTexts = new JTextField[]{MarrocosGolsXCroacia, CroaciaGolsXMarrocos, BelgicaGolsXCanada, CanadaGolsXBelgica, BelgicaGolsXMarrocos, MarrocosGolsXBelgica, CroaciaGolsXCanada, CanadaGolsXCroacia, CanadaGolsXMarrocos, MarrocosGolsXCanada, CroaciaGolsXBelgica, BelgicaGolsXCroacia};

    private Time[] GrupoFTimes = new Time[]{copa.getMorocco(), copa.getCroatia(), copa.getBelgium(), copa.getCanada()};

    private JTextField SuicaGolsXCamaroes;
    private JTextField CamaroesGolsXSuica;
    private JTextField BrasilGolsXServia;
    private JTextField SerrviaGolsXBrasil;
    private JTextField CamaroesGolsXServia;
    private JTextField ServiaGolsXCamaroes;
    private JTextField BrasilGolsXSuica;
    private JTextField SuicaGolsXBrasil;
    private JTextField ServiaGolsXSuica;
    private JTextField SuicaGolsXServia;
    private JTextField CamaroesGolsXBrasil;
    private JTextField BrasilGolsXCamaroes;

    private JTextField[] GrupoGTexts = new JTextField[]{SuicaGolsXCamaroes, CamaroesGolsXSuica, BrasilGolsXServia, SerrviaGolsXBrasil, CamaroesGolsXServia, ServiaGolsXCamaroes, BrasilGolsXSuica, SuicaGolsXBrasil, ServiaGolsXSuica, SuicaGolsXServia, CamaroesGolsXBrasil, BrasilGolsXCamaroes};

    private Time[] GrupoGTimes = new Time[]{copa.getBrazil(), copa.getSwitzerland(), copa.getCameroon(), copa.getSerbia()};

    private JTextField UruguaiGolsXCoreia;
    private JTextField CoreiaGolsXUruguai;
    private JTextField PortugalGolsXGana;
    private JTextField GanaGolsXPortugal;
    private JTextField CoreiaGolsXGana;
    private JTextField GanaGolsXCoreia;
    private JTextField PortugalGolsXUruguai;
    private JTextField UruguaiGolsXPortugal;
    private JTextField CoreiaGolsXPortual;
    private JTextField PortugalGolsXCoreia;
    private JTextField GanaGolsXUruguai;
    private JTextField UruguaiGolsXGana;

    private JTextField[] GrupoHTexts = new JTextField[]{UruguaiGolsXCoreia, CoreiaGolsXUruguai, PortugalGolsXGana, GanaGolsXPortugal, CoreiaGolsXGana, GanaGolsXCoreia, PortugalGolsXUruguai, UruguaiGolsXPortugal, CoreiaGolsXPortual, PortugalGolsXCoreia, GanaGolsXUruguai, UruguaiGolsXGana};

    private Time[] GrupoHTimes = new Time[]{copa.getUruguay(), copa.getGhana(), copa.getPortugal(), copa.getKorea()};

    private JTextField DinamarcaGolsXTunisia;
    private JTextField TunisiaGolsXDinamarca;
    private JTextField FrancaGolsXAustralia;
    private JTextField AustraliaGolsXFranca;
    private JTextField TunisiaGolsXAustralia;
    private JTextField AustraliaGolsXTunisia;
    private JTextField FrancaGolsXDinamarca;
    private JTextField DinamarcaGolsXFranca;
    private JTextField TunisiaGolsXFranca;
    private JTextField FrancaGolsXTunisia;
    private JTextField AustraliaGolsXDinamarca;
    private JTextField DinamarcaGolsXAustralia;

    private JTextField[] GrupoDTexts = new JTextField[]{DinamarcaGolsXTunisia, TunisiaGolsXDinamarca, FrancaGolsXAustralia, AustraliaGolsXFranca, TunisiaGolsXAustralia, AustraliaGolsXTunisia, FrancaGolsXDinamarca, DinamarcaGolsXFranca, TunisiaGolsXFranca, FrancaGolsXTunisia, AustraliaGolsXDinamarca, DinamarcaGolsXAustralia};

    private Time[] GrupoDTimes = new Time[]{copa.getFrance(), copa.getAustralia(), copa.getTunisia(), copa.getDenmark()};

    private JLabel Time1GrupoA;
    private JLabel Time2GrupoA;
    private JLabel Time3GrupoA;
    private JLabel Time4GrupoA;
    private JLabel Time1GrupoB;
    private JLabel Time2GrupoB;
    private JLabel Time3GrupoB;
    private JLabel Time4GrupoB;
    private JLabel Time1GrupoC;
    private JLabel Time2GrupoC;
    private JLabel Time3GrupoC;
    private JLabel Time4GrupoC;
    private JLabel Time1GrupoD;
    private JLabel Time2GrupoD;
    private JLabel Time3GrupoD;
    private JLabel Time4GrupoD;
    private JLabel Time1GrupoE;
    private JLabel Time2GrupoE;
    private JLabel Time3GrupoE;
    private JLabel Time4GrupoE;
    private JLabel Time1GrupoF;
    private JLabel Time2GrupoF;
    private JLabel Time3GrupoF;
    private JLabel Time4GrupoF;
    private JLabel Time1GrupoG;
    private JLabel Time2GrupoG;
    private JLabel Time3GrupoG;
    private JLabel Time4GrupoG;
    private JLabel Time1GrupoH;
    private JLabel Time2GrupoH;
    private JLabel Time3GrupoH;
    private JLabel Time4GrupoH;
    private JLabel V1A;
    private JLabel E1A;
    private JLabel D1A;
    private JLabel GP1A;
    private JLabel GC1A;
    private JLabel SG1A;
    private JLabel V2A;
    private JLabel E2A;
    private JLabel D2A;
    private JLabel GP2A;
    private JLabel GC2A;
    private JLabel SG2A;
    private JLabel V3A;
    private JLabel E3A;
    private JLabel D3A;
    private JLabel GP3A;
    private JLabel GC3A;
    private JLabel SG3A;
    private JLabel V4A;
    private JLabel E4A;
    private JLabel D4A;
    private JLabel GP4A;
    private JLabel GC4A;
    private JLabel SG4A;
    private JLabel V1B;
    private JLabel E1B;
    private JLabel D1B;
    private JLabel GP1B;
    private JLabel GC1B;
    private JLabel SG1B;
    private JLabel V2B;
    private JLabel E2B;
    private JLabel D2B;
    private JLabel GP2B;
    private JLabel GC2B;
    private JLabel SG2B;
    private JLabel V3B;
    private JLabel E3B;
    private JLabel D3B;
    private JLabel GP3B;
    private JLabel GC3B;
    private JLabel SG3B;
    private JLabel V4B;
    private JLabel E4B;
    private JLabel D4B;
    private JLabel GP4B;
    private JLabel GC4B;
    private JLabel SG4B;
    private JLabel V1C;
    private JLabel E1C;
    private JLabel D1C;
    private JLabel GP1C;
    private JLabel GC1C;
    private JLabel SG1C;
    private JLabel V2C;
    private JLabel E2C;
    private JLabel D2C;
    private JLabel GP2C;
    private JLabel GC2C;
    private JLabel SG2C;
    private JLabel V3C;
    private JLabel E3C;
    private JLabel D3C;
    private JLabel GP3C;
    private JLabel GC3C;
    private JLabel SG3C;
    private JLabel V4C;
    private JLabel E4C;
    private JLabel D4C;
    private JLabel GP4C;
    private JLabel GC4C;
    private JLabel SG4C;
    private JLabel E1D;
    private JLabel V1D;
    private JLabel D1D;
    private JLabel GP1D;
    private JLabel GC1D;
    private JLabel SG1D;
    private JLabel V2D;
    private JLabel E2D;
    private JLabel D2D;
    private JLabel GP2D;
    private JLabel GC2D;
    private JLabel SG2D;
    private JLabel V3D;
    private JLabel E3D;
    private JLabel D3D;
    private JLabel GP3D;
    private JLabel GC3D;
    private JLabel SG3D;
    private JLabel V4D;
    private JLabel E4D;
    private JLabel D4D;
    private JLabel GP4D;
    private JLabel GC4D;
    private JLabel SG4D;
    private JLabel V1E;
    private JLabel E1E;
    private JLabel D1E;
    private JLabel GP1E;
    private JLabel GC1E;
    private JLabel SG1E;
    private JLabel V2E;
    private JLabel E2E;
    private JLabel D2E;
    private JLabel GP2E;
    private JLabel GC2E;
    private JLabel SG2E;
    private JLabel V3E;
    private JLabel E3E;
    private JLabel D3E;
    private JLabel GP3E;
    private JLabel GC3E;
    private JLabel SG3E;
    private JLabel V4E;
    private JLabel E4E;
    private JLabel D4E;
    private JLabel GP4E;
    private JLabel GC4E;
    private JLabel SG4E;
    private JLabel V1F;
    private JLabel E1F;
    private JLabel D1F;
    private JLabel GP1F;
    private JLabel GC1F;
    private JLabel SG1F;
    private JLabel V2F;
    private JLabel E2F;
    private JLabel D2F;
    private JLabel GP2F;
    private JLabel GC2F;
    private JLabel SG2F;
    private JLabel V3F;
    private JLabel E3F;
    private JLabel D3F;
    private JLabel GP3F;
    private JLabel GC3F;
    private JLabel SG3F;
    private JLabel V4F;
    private JLabel E4F;
    private JLabel D4F;
    private JLabel GP4F;
    private JLabel GC4F;
    private JLabel SG4F;
    private JLabel V1G;
    private JLabel E1G;
    private JLabel D1G;
    private JLabel GP1G;
    private JLabel GC1G;
    private JLabel SG1G;
    private JLabel V2G;
    private JLabel E2G;
    private JLabel D2G;
    private JLabel GP2G;
    private JLabel GC2G;
    private JLabel SG2G;
    private JLabel V3G;
    private JLabel E3G;
    private JLabel D3G;
    private JLabel GP3G;
    private JLabel GC3G;
    private JLabel SG3G;
    private JLabel V4G;
    private JLabel E4G;
    private JLabel D4G;
    private JLabel GP4G;
    private JLabel GC4G;
    private JLabel SG4G;
    private JLabel V1H;
    private JLabel E1H;
    private JLabel D1H;
    private JLabel GP1H;
    private JLabel GC1H;
    private JLabel SG1H;
    private JLabel V2H;
    private JLabel E2H;
    private JLabel D2H;
    private JLabel GP2H;
    private JLabel GC2H;
    private JLabel SG2H;
    private JLabel V3H;
    private JLabel E3H;
    private JLabel D3H;
    private JLabel GP3H;
    private JLabel GC3H;
    private JLabel SG3H;
    private JLabel V4H;
    private JLabel E4H;
    private JLabel D4H;
    private JLabel GP4H;
    private JLabel GC4H;
    private JLabel SG4H;
    private JPanel MataMata;
    private JButton enviarBotaoGrupoA;
    private JButton enviarBotaoGrupoB;
    private JButton enviarBotaoGrupoC;
    private JButton enviarBotaoGupoD;
    private JButton enviarBotaoGrupoE;
    private JButton enviarBotaoGrupoG;
    private JButton enviarBotaoGrupoH;
    private JButton enviarBotaoGupoF;
    private JLabel PTS1A;
    private JLabel PTS2A;
    private JLabel PTS3A;
    private JLabel PTS4A;
    private JLabel PTS1B;
    private JLabel PTS2B;
    private JLabel PTS3B;
    private JLabel PTS4B;
    private JLabel PTS1C;
    private JLabel PTS2C;
    private JLabel PTS3C;
    private JLabel PTS4C;
    private JLabel PTS1D;
    private JLabel PTS2D;
    private JLabel PTS3D;
    private JLabel PTS4D;
    private JLabel PTS1E;
    private JLabel PTS2E;
    private JLabel PTS3E;
    private JLabel PTS4E;
    private JLabel PTS1F;
    private JLabel PTS2F;
    private JLabel PTS3F;
    private JLabel PTS4F;
    private JLabel PTS1G;
    private JLabel PTS2G;
    private JLabel PTS3G;
    private JLabel PTS4G;
    private JLabel PTS1H;
    private JLabel PTS2H;
    private JLabel PTS3H;
    private JLabel PTS4H;
    private JTextField Gols1Oitavas1;
    private JTextField Gols2Oitavas1;
    private JTextField Gols1Oitavas2;
    private JTextField Gols2Oitavas2;
    private JTextField Gols1Oitavas3;
    private JTextField Gols2Oitavas3;
    private JTextField Gols1Oitavas4;
    private JTextField Gols2Oitavas4;
    private JTextField Gols1Quartas1;
    private JTextField Gols2Quartas1;
    private JTextField Gols1Quartas2;
    private JTextField Gols2Quartas2;
    private JTextField Gols1Semi1;
    private JTextField Gols2Semi1;
    private JTextField Gols1Oitavas5;
    private JTextField Gols2Oitavas5;
    private JTextField Gols1Oitavas6;
    private JTextField Gols2Oitavas6;
    private JTextField Gols1Oitavas7;
    private JTextField Gols2Oitavas7;
    private JTextField Gols1Oitavas8;
    private JTextField Gols2Oitavas8;
    private JTextField Gols1Quartas3;
    private JTextField Gols2Quartas3;
    private JTextField Gols2Quartas4;
    private JTextField Gols1Quartas4;
    private JTextField Gols2Semi2;
    private JTextField Gols1Semi2;
    private JTextField Gols1Final;
    private JTextField Gols2Final;
    private JTextField Gols2Terceiro;
    private JTextField Gols1Terceiro;
    private JTextField Penaltis1Oitavas1;
    private JTextField Penaltis2Oitavas1;
    private JTextField Penaltis1Oitavas2;
    private JTextField Penaltis2Oitavas2;
    private JTextField Penaltis1Oitavas3;
    private JTextField Penaltis2Oitavas3;
    private JTextField Penaltis1Oitavas4;
    private JTextField Penaltis2Oitavas4;
    private JTextField Penaltis1Quartas1;
    private JTextField Penaltis2Quartas1;
    private JTextField Penaltis1Quartas2;
    private JTextField Penaltis2Quartas2;
    private JTextField Penaltis1Semi1;
    private JTextField Penaltis2Semi1;
    private JTextField Penaltis1Oitavas5;
    private JTextField Penaltis2Oitavas5;
    private JTextField Penaltis1Oitavas6;
    private JTextField Penaltis2Oitavas6;
    private JTextField Penaltis1Oitavas7;
    private JTextField Penaltis2Oitavas7;
    private JTextField Penaltis1Oitavas8;
    private JTextField Penaltis2Oitavas8;
    private JTextField Penaltis1Quartas3;
    private JTextField Penaltis2Quartas3;
    private JTextField Penaltis1Quartas4;
    private JTextField Penaltis2Quartas4;
    private JTextField Penaltis1Semi2;
    private JTextField Penaltis2Semi2;
    private JLabel A1;
    private JLabel B2;
    private JLabel C1;
    private JLabel D2;
    private JLabel E1;
    private JLabel F2;
    private JLabel G1;
    private JLabel H2;
    private JLabel B1;
    private JLabel A2;
    private JLabel D1;
    private JLabel C2;
    private JLabel F1;
    private JLabel E2;
    private JLabel H1;
    private JLabel G2;
    private JLabel VencedorOitavas1;
    private JLabel VencedorOitavas2;
    private JLabel VencedorOitavas3;
    private JLabel VencedorOitavas4;
    private JLabel VencedorOitavas5;
    private JLabel VencedorOitavas6;
    private JLabel VencedorOitavas7;
    private JLabel VencedorOitavas8;
    private JLabel VencedorQuartas1;
    private JLabel VencedorQuartas2;
    private JLabel VencedorQuartas3;
    private JLabel VencedorQuartas4;
    private JLabel VencedorSemi1;
    private JLabel VencedorSemi2;
    private JLabel PerderdorSemi1;
    private JLabel PerderdorSemi2;
    private JLabel VencedorFinal;
    private JLabel VencedorTerceiro;
    private JTextField Penaltis1Final;
    private JTextField Penaltis2Final;
    private JTextField Penaltis1Terceiro;
    private JTextField Penaltis2Terceiro;
    private JButton enviarOitavas1;
    private JButton enviarOitavas2;
    private JButton enviarOitavas3;
    private JButton enviarOitavas4;
    private JButton enviarQuartas1;
    private JButton enviarQuartas2;
    private JButton enviarSemi2;
    private JButton enviarQuartas3;
    private JButton enviarQuartas4;
    private JButton enviarSemi1;
    private JButton enviarOitavas5;
    private JButton enviarOitavas6;
    private JButton enviarOitavas7;
    private JButton enviarOitavas8;
    private JButton enviarFinal;
    private JButton enviarTerceira;

    public Tabela() {

        enviarBotaoGrupoA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JLabel[] times = new JLabel[]{Time1GrupoA, Time2GrupoA, Time3GrupoA, Time4GrupoA};

                JLabel[] vitorias = new JLabel[]{V1A, V2A, V3A, V4A};

                JLabel[] empates = new JLabel[]{E1A, E2A, E3A, E4A};

                JLabel[] derrotas = new JLabel[]{D1A, D2A, D3A, D4A};

                JLabel[] golsPro = new JLabel[]{GP1A, GP2A, GP3A, GP4A};

                JLabel[] golsCon = new JLabel[]{GC1A,GC2A, GC3A, GC4A};

                JLabel[] saldoGols = new JLabel[]{SG1A, SG2A, SG3A, SG4A};

                JLabel[] pontos = new JLabel[]{PTS1A, PTS2A, PTS3A, PTS4A};

                ArrayList<Time> GrupoAArrayList = new ArrayList<>();

                for(int i = 0; i < GrupoATimes.length; i++){

                    GrupoAArrayList.add(GrupoATimes[i]);

                }

                for(int i = 0; i < GrupoAArrayList.size(); i++){

                    vitorias[i].setText("0");

                    empates[i].setText("0");

                    derrotas[i].setText("0");

                    golsPro[i].setText("0");

                    golsCon[i].setText("0");

                    saldoGols[i].setText("0");

                    pontos[i].setText("0");

                    GrupoAArrayList.get(i).clear();

                }

                for(int i = 0; i < 6; i++){

                    copa.getPartidas().get(i).setGols1(Integer.parseInt(GrupoATexts[2*i].getText()));

                    copa.getPartidas().get(i).getTime1().addGols(Integer.parseInt(GrupoATexts[2*i].getText()));

                    copa.getPartidas().get(i).getTime2().addGolsSofridos(Integer.parseInt(GrupoATexts[2*i].getText()));

                    copa.getPartidas().get(i).setGols2(Integer.parseInt(GrupoATexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i).getTime2().addGols(Integer.parseInt(GrupoATexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i).getTime1().addGolsSofridos(Integer.parseInt(GrupoATexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i).definePontos();

                    copa.getPartidas().get(i).defineVDE();

                }

                for(int i = 0; i < GrupoATimes.length; i++){

                    GrupoAArrayList.remove(0);

                }

                for(int i = 0; i < GrupoATimes.length; i++){

                    GrupoATimes[i].definePontos();

                    GrupoATimes[i].defineSaldoDeGols();

                    GrupoAArrayList.add(GrupoATimes[i]);

                }

                Collections.sort(GrupoAArrayList, new Comparador());

                for(int i = 0; i < GrupoAArrayList.size(); i++){

                   times[i].setText(GrupoAArrayList.get(i).getNome());

                   vitorias[i].setText(Integer.toString(GrupoAArrayList.get(i).getVitorias()));

                   empates[i].setText(Integer.toString(GrupoAArrayList.get(i).getEmpates()));

                   derrotas[i].setText(Integer.toString(GrupoAArrayList.get(i).getDerrotas()));

                   golsPro[i].setText(Integer.toString(GrupoAArrayList.get(i).getnGols()));

                   golsCon[i].setText(Integer.toString(GrupoAArrayList.get(i).getnGolsSofridos()));

                   saldoGols[i].setText(Integer.toString(GrupoAArrayList.get(i).getSaldoGols()));

                   pontos[i].setText(Integer.toString(GrupoAArrayList.get(i).getPontos()));

                }

                A1.setText(GrupoAArrayList.get(0).getNome());

                A2.setText(GrupoAArrayList.get(1).getNome());

            }
        });
        enviarBotaoGrupoB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JLabel[] times = new JLabel[]{Time1GrupoB, Time2GrupoB, Time3GrupoB, Time4GrupoB};

                JLabel[] vitorias = new JLabel[]{V1B, V2B, V3B, V4B};

                JLabel[] empates = new JLabel[]{E1B, E2B, E3B, E4B};

                JLabel[] derrotas = new JLabel[]{D1B, D2B, D3B, D4B};

                JLabel[] golsPro = new JLabel[]{GP1B, GP2B, GP3B, GP4B};

                JLabel[] golsCon = new JLabel[]{GC1B,GC2B, GC3B, GC4B};

                JLabel[] saldoGols = new JLabel[]{SG1B, SG2B, SG3B, SG4B};

                JLabel[] pontos = new JLabel[]{PTS1B, PTS2B, PTS3B, PTS4B};

                ArrayList<Time> GrupoBArrayList = new ArrayList<>();

                for(int i = 0; i < GrupoBTimes.length; i++){

                    GrupoBArrayList.add(GrupoBTimes[i]);

                }

                for(int i = 0; i < GrupoBArrayList.size(); i++){

                    vitorias[i].setText("0");

                    empates[i].setText("0");

                    derrotas[i].setText("0");

                    golsPro[i].setText("0");

                    golsCon[i].setText("0");

                    saldoGols[i].setText("0");

                    pontos[i].setText("0");

                    GrupoBArrayList.get(i).clear();

                }

                for(int i = 0; i < 6; i++){

                    copa.getPartidas().get(i + 6).setGols1(Integer.parseInt(GrupoBTexts[2*i].getText()));

                    copa.getPartidas().get(i + 6).getTime1().addGols(Integer.parseInt(GrupoBTexts[2*i].getText()));

                    copa.getPartidas().get(i + 6).getTime2().addGolsSofridos(Integer.parseInt(GrupoBTexts[2*i].getText()));

                    copa.getPartidas().get(i + 6).setGols2(Integer.parseInt(GrupoBTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 6).getTime2().addGols(Integer.parseInt(GrupoBTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 6).getTime1().addGolsSofridos(Integer.parseInt(GrupoBTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 6).definePontos();

                    copa.getPartidas().get(i + 6).defineVDE();

                }

                for(int i = 0; i < GrupoBTimes.length; i++){

                    GrupoBArrayList.remove(0);

                }

                for(int i = 0; i < GrupoBTimes.length; i++){

                    GrupoBTimes[i].definePontos();

                    GrupoBTimes[i].defineSaldoDeGols();

                    GrupoBArrayList.add(GrupoBTimes[i]);

                }

                Collections.sort(GrupoBArrayList, new Comparador());

                for(int i = 0; i < GrupoBArrayList.size(); i++){

                    times[i].setText(GrupoBArrayList.get(i).getNome());

                    vitorias[i].setText(Integer.toString(GrupoBArrayList.get(i).getVitorias()));

                    empates[i].setText(Integer.toString(GrupoBArrayList.get(i).getEmpates()));

                    derrotas[i].setText(Integer.toString(GrupoBArrayList.get(i).getDerrotas()));

                    golsPro[i].setText(Integer.toString(GrupoBArrayList.get(i).getnGols()));

                    golsCon[i].setText(Integer.toString(GrupoBArrayList.get(i).getnGolsSofridos()));

                    saldoGols[i].setText(Integer.toString(GrupoBArrayList.get(i).getSaldoGols()));

                    pontos[i].setText(Integer.toString(GrupoBArrayList.get(i).getPontos()));

                }

                B1.setText(GrupoBArrayList.get(0).getNome());

                B2.setText(GrupoBArrayList.get(1).getNome());

            }
        });
        enviarBotaoGrupoC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JLabel[] times = new JLabel[]{Time1GrupoC, Time2GrupoC, Time3GrupoC, Time4GrupoC};

                JLabel[] vitorias = new JLabel[]{V1C, V2C, V3C, V4C};

                JLabel[] empates = new JLabel[]{E1C, E2C, E3C, E4C};

                JLabel[] derrotas = new JLabel[]{D1C, D2C, D3C, D4C};

                JLabel[] golsPro = new JLabel[]{GP1C, GP2C, GP3C, GP4C};

                JLabel[] golsCon = new JLabel[]{GC1C,GC2C, GC3C, GC4C};

                JLabel[] saldoGols = new JLabel[]{SG1C, SG2C, SG3C, SG4C};

                JLabel[] pontos = new JLabel[]{PTS1C, PTS2C, PTS3C, PTS4C};

                ArrayList<Time> GrupoCArrayList = new ArrayList<>();

                for(int i = 0; i < GrupoCTimes.length; i++){

                    GrupoCArrayList.add(GrupoCTimes[i]);

                }

                for(int i = 0; i < GrupoCArrayList.size(); i++){

                    vitorias[i].setText("0");

                    empates[i].setText("0");

                    derrotas[i].setText("0");

                    golsPro[i].setText("0");

                    golsCon[i].setText("0");

                    saldoGols[i].setText("0");

                    pontos[i].setText("0");

                    GrupoCArrayList.get(i).clear();

                }

                for(int i = 0; i < 6; i++){

                    copa.getPartidas().get(i + 12).setGols1(Integer.parseInt(GrupoCTexts[2*i].getText()));

                    copa.getPartidas().get(i + 12).getTime1().addGols(Integer.parseInt(GrupoCTexts[2*i].getText()));

                    copa.getPartidas().get(i + 12).getTime2().addGolsSofridos(Integer.parseInt(GrupoCTexts[2*i].getText()));

                    copa.getPartidas().get(i + 12).setGols2(Integer.parseInt(GrupoCTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 12).getTime2().addGols(Integer.parseInt(GrupoCTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 12).getTime1().addGolsSofridos(Integer.parseInt(GrupoCTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 12).definePontos();

                    copa.getPartidas().get(i + 12).defineVDE();

                }

                for(int i = 0; i < GrupoCTimes.length; i++){

                    GrupoCArrayList.remove(0);

                }

                for(int i = 0; i < GrupoCTimes.length; i++){

                    GrupoCTimes[i].definePontos();

                    GrupoCTimes[i].defineSaldoDeGols();

                    GrupoCArrayList.add(GrupoCTimes[i]);

                }

                Collections.sort(GrupoCArrayList, new Comparador());

                for(int i = 0; i < GrupoCArrayList.size(); i++){

                    times[i].setText(GrupoCArrayList.get(i).getNome());

                    vitorias[i].setText(Integer.toString(GrupoCArrayList.get(i).getVitorias()));

                    empates[i].setText(Integer.toString(GrupoCArrayList.get(i).getEmpates()));

                    derrotas[i].setText(Integer.toString(GrupoCArrayList.get(i).getDerrotas()));

                    golsPro[i].setText(Integer.toString(GrupoCArrayList.get(i).getnGols()));

                    golsCon[i].setText(Integer.toString(GrupoCArrayList.get(i).getnGolsSofridos()));

                    saldoGols[i].setText(Integer.toString(GrupoCArrayList.get(i).getSaldoGols()));

                    pontos[i].setText(Integer.toString(GrupoCArrayList.get(i).getPontos()));

                }

                C1.setText(GrupoCArrayList.get(0).getNome());

                C2.setText(GrupoCArrayList.get(1).getNome());

            }
        });
        enviarBotaoGupoD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JLabel[] times = new JLabel[]{Time1GrupoD, Time2GrupoD, Time3GrupoD, Time4GrupoD};

                JLabel[] vitorias = new JLabel[]{V1D, V2D, V3D, V4D};

                JLabel[] empates = new JLabel[]{E1D, E2D, E3D, E4D};

                JLabel[] derrotas = new JLabel[]{D1D, D2D, D3D, D4D};

                JLabel[] golsPro = new JLabel[]{GP1D, GP2D, GP3D, GP4D};

                JLabel[] golsCon = new JLabel[]{GC1D,GC2D, GC3D, GC4D};

                JLabel[] saldoGols = new JLabel[]{SG1D, SG2D, SG3D, SG4D};

                JLabel[] pontos = new JLabel[]{PTS1D, PTS2D, PTS3D, PTS4D};

                ArrayList<Time> GrupoDArrayList = new ArrayList<>();

                for(int i = 0; i < GrupoDTimes.length; i++){

                    GrupoDArrayList.add(GrupoDTimes[i]);

                }

                for(int i = 0; i < GrupoDArrayList.size(); i++){

                    vitorias[i].setText("0");

                    empates[i].setText("0");

                    derrotas[i].setText("0");

                    golsPro[i].setText("0");

                    golsCon[i].setText("0");

                    saldoGols[i].setText("0");

                    pontos[i].setText("0");

                    GrupoDArrayList.get(i).clear();

                }

                for(int i = 0; i < 6; i++){

                    copa.getPartidas().get(i + 18).setGols1(Integer.parseInt(GrupoDTexts[2*i].getText()));

                    copa.getPartidas().get(i + 18).getTime1().addGols(Integer.parseInt(GrupoDTexts[2*i].getText()));

                    copa.getPartidas().get(i + 18).getTime2().addGolsSofridos(Integer.parseInt(GrupoDTexts[2*i].getText()));

                    copa.getPartidas().get(i + 18).setGols2(Integer.parseInt(GrupoDTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 18).getTime2().addGols(Integer.parseInt(GrupoDTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 18).getTime1().addGolsSofridos(Integer.parseInt(GrupoDTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 18).definePontos();

                    copa.getPartidas().get(i + 18).defineVDE();

                }

                for(int i = 0; i < GrupoDTimes.length; i++){

                    GrupoDArrayList.remove(0);

                }

                for(int i = 0; i < GrupoDTimes.length; i++){

                    GrupoDTimes[i].definePontos();

                    GrupoDTimes[i].defineSaldoDeGols();

                    GrupoDArrayList.add(GrupoDTimes[i]);

                }

                Collections.sort(GrupoDArrayList, new Comparador());

                for(int i = 0; i < GrupoDArrayList.size(); i++){

                    times[i].setText(GrupoDArrayList.get(i).getNome());

                    vitorias[i].setText(Integer.toString(GrupoDArrayList.get(i).getVitorias()));

                    empates[i].setText(Integer.toString(GrupoDArrayList.get(i).getEmpates()));

                    derrotas[i].setText(Integer.toString(GrupoDArrayList.get(i).getDerrotas()));

                    golsPro[i].setText(Integer.toString(GrupoDArrayList.get(i).getnGols()));

                    golsCon[i].setText(Integer.toString(GrupoDArrayList.get(i).getnGolsSofridos()));

                    saldoGols[i].setText(Integer.toString(GrupoDArrayList.get(i).getSaldoGols()));

                    pontos[i].setText(Integer.toString(GrupoDArrayList.get(i).getPontos()));

                }

                D1.setText(GrupoDArrayList.get(0).getNome());

                D2.setText(GrupoDArrayList.get(1).getNome());

            }
        });
        enviarBotaoGrupoE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JLabel[] times = new JLabel[]{Time1GrupoE, Time2GrupoE, Time3GrupoE, Time4GrupoE};

                JLabel[] vitorias = new JLabel[]{V1E, V2E, V3E, V4E};

                JLabel[] empates = new JLabel[]{E1E, E2E, E3E, E4E};

                JLabel[] derrotas = new JLabel[]{D1E, D2E, D3E, D4E};

                JLabel[] golsPro = new JLabel[]{GP1E, GP2E, GP3E, GP4E};

                JLabel[] golsCon = new JLabel[]{GC1E,GC2E, GC3E, GC4E};

                JLabel[] saldoGols = new JLabel[]{SG1E, SG2E, SG3E, SG4E};

                JLabel[] pontos = new JLabel[]{PTS1E, PTS2E, PTS3E, PTS4E};

                ArrayList<Time> GrupoEArrayList = new ArrayList<>();

                for(int i = 0; i < GrupoETimes.length; i++){

                    GrupoEArrayList.add(GrupoETimes[i]);

                }

                for(int i = 0; i < GrupoEArrayList.size(); i++){

                    vitorias[i].setText("0");

                    empates[i].setText("0");

                    derrotas[i].setText("0");

                    golsPro[i].setText("0");

                    golsCon[i].setText("0");

                    saldoGols[i].setText("0");

                    pontos[i].setText("0");

                    GrupoEArrayList.get(i).clear();

                }

                for(int i = 0; i < 6; i++){

                    copa.getPartidas().get(i + 24).setGols1(Integer.parseInt(GrupoETexts[2*i].getText()));

                    copa.getPartidas().get(i + 24).getTime1().addGols(Integer.parseInt(GrupoETexts[2*i].getText()));

                    copa.getPartidas().get(i + 24).getTime2().addGolsSofridos(Integer.parseInt(GrupoETexts[2*i].getText()));

                    copa.getPartidas().get(i + 24).setGols2(Integer.parseInt(GrupoETexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 24).getTime2().addGols(Integer.parseInt(GrupoETexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 24).getTime1().addGolsSofridos(Integer.parseInt(GrupoETexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 24).definePontos();

                    copa.getPartidas().get(i + 24).defineVDE();

                }

                for(int i = 0; i < GrupoETimes.length; i++){

                    GrupoEArrayList.remove(0);

                }

                for(int i = 0; i < GrupoETimes.length; i++){

                    GrupoETimes[i].definePontos();

                    GrupoETimes[i].defineSaldoDeGols();

                    GrupoEArrayList.add(GrupoETimes[i]);

                }

                Collections.sort(GrupoEArrayList, new Comparador());

                for(int i = 0; i < GrupoEArrayList.size(); i++){

                    times[i].setText(GrupoEArrayList.get(i).getNome());

                    vitorias[i].setText(Integer.toString(GrupoEArrayList.get(i).getVitorias()));

                    empates[i].setText(Integer.toString(GrupoEArrayList.get(i).getEmpates()));

                    derrotas[i].setText(Integer.toString(GrupoEArrayList.get(i).getDerrotas()));

                    golsPro[i].setText(Integer.toString(GrupoEArrayList.get(i).getnGols()));

                    golsCon[i].setText(Integer.toString(GrupoEArrayList.get(i).getnGolsSofridos()));

                    saldoGols[i].setText(Integer.toString(GrupoEArrayList.get(i).getSaldoGols()));

                    pontos[i].setText(Integer.toString(GrupoEArrayList.get(i).getPontos()));

                }

                E1.setText(GrupoEArrayList.get(0).getNome());

                E2.setText(GrupoEArrayList.get(1).getNome());

            }
        });
        enviarBotaoGupoF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JLabel[] times = new JLabel[]{Time1GrupoF, Time2GrupoF, Time3GrupoF, Time4GrupoF};

                JLabel[] vitorias = new JLabel[]{V1F, V2F, V3F, V4F};

                JLabel[] empates = new JLabel[]{E1F, E2F, E3F, E4F};

                JLabel[] derrotas = new JLabel[]{D1F, D2F, D3F, D4F};

                JLabel[] golsPro = new JLabel[]{GP1F, GP2F, GP3F, GP4F};

                JLabel[] golsCon = new JLabel[]{GC1F,GC2F, GC3F, GC4F};

                JLabel[] saldoGols = new JLabel[]{SG1F, SG2F, SG3F, SG4F};

                JLabel[] pontos = new JLabel[]{PTS1F, PTS2F, PTS3F, PTS4F};

                ArrayList<Time> GrupoFArrayList = new ArrayList<>();

                for(int i = 0; i < GrupoFTimes.length; i++){

                    GrupoFArrayList.add(GrupoFTimes[i]);

                }

                for(int i = 0; i < GrupoFArrayList.size(); i++){

                    vitorias[i].setText("0");

                    empates[i].setText("0");

                    derrotas[i].setText("0");

                    golsPro[i].setText("0");

                    golsCon[i].setText("0");

                    saldoGols[i].setText("0");

                    pontos[i].setText("0");

                    GrupoFArrayList.get(i).clear();

                }

                for(int i = 0; i < 6; i++){

                    copa.getPartidas().get(i + 30).setGols1(Integer.parseInt(GrupoFTexts[2*i].getText()));

                    copa.getPartidas().get(i + 30).getTime1().addGols(Integer.parseInt(GrupoFTexts[2*i].getText()));

                    copa.getPartidas().get(i + 30).getTime2().addGolsSofridos(Integer.parseInt(GrupoFTexts[2*i].getText()));

                    copa.getPartidas().get(i + 30).setGols2(Integer.parseInt(GrupoFTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 30).getTime2().addGols(Integer.parseInt(GrupoFTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 30).getTime1().addGolsSofridos(Integer.parseInt(GrupoFTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 30).definePontos();

                    copa.getPartidas().get(i + 30).defineVDE();

                }

                for(int i = 0; i < GrupoATimes.length; i++){

                    GrupoFArrayList.remove(0);

                }

                for(int i = 0; i < GrupoFTimes.length; i++){

                    GrupoFTimes[i].definePontos();

                    GrupoFTimes[i].defineSaldoDeGols();

                    GrupoFArrayList.add(GrupoFTimes[i]);

                }

                Collections.sort(GrupoFArrayList, new Comparador());

                for(int i = 0; i < GrupoFArrayList.size(); i++){

                    times[i].setText(GrupoFArrayList.get(i).getNome());

                    vitorias[i].setText(Integer.toString(GrupoFArrayList.get(i).getVitorias()));

                    empates[i].setText(Integer.toString(GrupoFArrayList.get(i).getEmpates()));

                    derrotas[i].setText(Integer.toString(GrupoFArrayList.get(i).getDerrotas()));

                    golsPro[i].setText(Integer.toString(GrupoFArrayList.get(i).getnGols()));

                    golsCon[i].setText(Integer.toString(GrupoFArrayList.get(i).getnGolsSofridos()));

                    saldoGols[i].setText(Integer.toString(GrupoFArrayList.get(i).getSaldoGols()));

                    pontos[i].setText(Integer.toString(GrupoFArrayList.get(i).getPontos()));

                }

                F1.setText(GrupoFArrayList.get(0).getNome());

                F2.setText(GrupoFArrayList.get(1).getNome());

            }
        });
        enviarBotaoGrupoG.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JLabel[] times = new JLabel[]{Time1GrupoG, Time2GrupoG, Time3GrupoG, Time4GrupoG};

                JLabel[] vitorias = new JLabel[]{V1G, V2G, V3G, V4G};

                JLabel[] empates = new JLabel[]{E1G, E2G, E3G, E4G};

                JLabel[] derrotas = new JLabel[]{D1G, D2G, D3G, D4G};

                JLabel[] golsPro = new JLabel[]{GP1G, GP2G, GP3G, GP4G};

                JLabel[] golsCon = new JLabel[]{GC1G,GC2G, GC3G, GC4G};

                JLabel[] saldoGols = new JLabel[]{SG1G, SG2G, SG3G, SG4G};

                JLabel[] pontos = new JLabel[]{PTS1G, PTS2G, PTS3G, PTS4G};

                ArrayList<Time> GrupoGArrayList = new ArrayList<>();

                for(int i = 0; i < GrupoGTimes.length; i++){

                    GrupoGArrayList.add(GrupoGTimes[i]);

                }

                for(int i = 0; i < GrupoGArrayList.size(); i++){

                    vitorias[i].setText("0");

                    empates[i].setText("0");

                    derrotas[i].setText("0");

                    golsPro[i].setText("0");

                    golsCon[i].setText("0");

                    saldoGols[i].setText("0");

                    pontos[i].setText("0");

                    GrupoGArrayList.get(i).clear();

                }

                for(int i = 0; i < 6; i++){

                    copa.getPartidas().get(i + 36).setGols1(Integer.parseInt(GrupoGTexts[2*i].getText()));

                    copa.getPartidas().get(i + 36).getTime1().addGols(Integer.parseInt(GrupoGTexts[2*i].getText()));

                    copa.getPartidas().get(i + 36).getTime2().addGolsSofridos(Integer.parseInt(GrupoGTexts[2*i].getText()));

                    copa.getPartidas().get(i + 36).setGols2(Integer.parseInt(GrupoGTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 36).getTime2().addGols(Integer.parseInt(GrupoGTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 36).getTime1().addGolsSofridos(Integer.parseInt(GrupoGTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 36).definePontos();

                    copa.getPartidas().get(i + 36).defineVDE();

                }

                for(int i = 0; i < GrupoGTimes.length; i++){

                    GrupoGArrayList.remove(0);

                }

                for(int i = 0; i < GrupoGTimes.length; i++){

                    GrupoGTimes[i].definePontos();

                    GrupoGTimes[i].defineSaldoDeGols();

                    GrupoGArrayList.add(GrupoGTimes[i]);

                }

                Collections.sort(GrupoGArrayList, new Comparador());

                for(int i = 0; i < GrupoGArrayList.size(); i++){

                    times[i].setText(GrupoGArrayList.get(i).getNome());

                    vitorias[i].setText(Integer.toString(GrupoGArrayList.get(i).getVitorias()));

                    empates[i].setText(Integer.toString(GrupoGArrayList.get(i).getEmpates()));

                    derrotas[i].setText(Integer.toString(GrupoGArrayList.get(i).getDerrotas()));

                    golsPro[i].setText(Integer.toString(GrupoGArrayList.get(i).getnGols()));

                    golsCon[i].setText(Integer.toString(GrupoGArrayList.get(i).getnGolsSofridos()));

                    saldoGols[i].setText(Integer.toString(GrupoGArrayList.get(i).getSaldoGols()));

                    pontos[i].setText(Integer.toString(GrupoGArrayList.get(i).getPontos()));

                }

                G1.setText(GrupoGArrayList.get(0).getNome());

                G2.setText(GrupoGArrayList.get(1).getNome());

            }
        });
        enviarBotaoGrupoH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JLabel[] times = new JLabel[]{Time1GrupoH, Time2GrupoH, Time3GrupoH, Time4GrupoH};

                JLabel[] vitorias = new JLabel[]{V1H, V2H, V3H, V4H};

                JLabel[] empates = new JLabel[]{E1H, E2H, E3H, E4H};

                JLabel[] derrotas = new JLabel[]{D1H, D2H, D3H, D4H};

                JLabel[] golsPro = new JLabel[]{GP1H, GP2H, GP3H, GP4H};

                JLabel[] golsCon = new JLabel[]{GC1H,GC2H, GC3H, GC4H};

                JLabel[] saldoGols = new JLabel[]{SG1H, SG2H, SG3H, SG4H};

                JLabel[] pontos = new JLabel[]{PTS1H, PTS2H, PTS3H, PTS4H};

                ArrayList<Time> GrupoHArrayList = new ArrayList<>();

                for(int i = 0; i < GrupoHTimes.length; i++){

                    GrupoHArrayList.add(GrupoHTimes[i]);

                }

                for(int i = 0; i < GrupoHArrayList.size(); i++){

                    vitorias[i].setText("0");

                    empates[i].setText("0");

                    derrotas[i].setText("0");

                    golsPro[i].setText("0");

                    golsCon[i].setText("0");

                    saldoGols[i].setText("0");

                    pontos[i].setText("0");

                    GrupoHArrayList.get(i).clear();

                }

                for(int i = 0; i < 6; i++){

                    copa.getPartidas().get(i + 42).setGols1(Integer.parseInt(GrupoHTexts[2*i].getText()));

                    copa.getPartidas().get(i + 42).getTime1().addGols(Integer.parseInt(GrupoHTexts[2*i].getText()));

                    copa.getPartidas().get(i + 42).getTime2().addGolsSofridos(Integer.parseInt(GrupoHTexts[2*i].getText()));

                    copa.getPartidas().get(i + 42).setGols2(Integer.parseInt(GrupoHTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 42).getTime2().addGols(Integer.parseInt(GrupoHTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 42).getTime1().addGolsSofridos(Integer.parseInt(GrupoHTexts[(2*i) + 1].getText()));

                    copa.getPartidas().get(i + 42).definePontos();

                    copa.getPartidas().get(i + 42).defineVDE();

                }

                for(int i = 0; i < GrupoHTimes.length; i++){

                    GrupoHArrayList.remove(0);

                }

                for(int i = 0; i < GrupoHTimes.length; i++){

                    GrupoHTimes[i].definePontos();

                    GrupoHTimes[i].defineSaldoDeGols();

                    GrupoHArrayList.add(GrupoHTimes[i]);

                }

                Collections.sort(GrupoHArrayList, new Comparador());

                for(int i = 0; i < GrupoHArrayList.size(); i++){

                    times[i].setText(GrupoHArrayList.get(i).getNome());

                    vitorias[i].setText(Integer.toString(GrupoHArrayList.get(i).getVitorias()));

                    empates[i].setText(Integer.toString(GrupoHArrayList.get(i).getEmpates()));

                    derrotas[i].setText(Integer.toString(GrupoHArrayList.get(i).getDerrotas()));

                    golsPro[i].setText(Integer.toString(GrupoHArrayList.get(i).getnGols()));

                    golsCon[i].setText(Integer.toString(GrupoHArrayList.get(i).getnGolsSofridos()));

                    saldoGols[i].setText(Integer.toString(GrupoHArrayList.get(i).getSaldoGols()));

                    pontos[i].setText(Integer.toString(GrupoHArrayList.get(i).getPontos()));

                }

                H1.setText(GrupoHArrayList.get(0).getNome());

                H2.setText(GrupoHArrayList.get(1).getNome());

            }
        });

        enviarOitavas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(A1.getText() != "1A" && B2.getText() != "2B") {

                    try {

                        if (Integer.parseInt(Gols1Oitavas1.getText()) == Integer.parseInt(Gols2Oitavas1.getText())) {

                            Penaltis1Oitavas1.setEditable(true);

                            Penaltis2Oitavas1.setEditable(true);

                            Gols1Oitavas1.setEditable(false);

                            Gols2Oitavas1.setEditable(false);

                            if (Integer.parseInt(Penaltis1Oitavas1.getText()) > Integer.parseInt(Penaltis2Oitavas1.getText())) {

                                VencedorOitavas1.setText(A1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas1.getText()) < Integer.parseInt(Penaltis2Oitavas1.getText())) {

                                VencedorOitavas1.setText(B2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas1.getText()) == Integer.parseInt(Penaltis2Oitavas1.getText())) {

                                Penaltis1Oitavas1.setText("");

                                Penaltis2Oitavas1.setText("");

                                Penaltis1Oitavas1.setEditable(false);

                                Penaltis2Oitavas1.setEditable(false);

                                Gols1Oitavas1.setEditable(true);

                                Gols2Oitavas1.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Oitavas1.getText()) > Integer.parseInt(Gols2Oitavas1.getText())) {

                            VencedorOitavas1.setText(A1.getText());

                        } else {

                            VencedorOitavas1.setText(B2.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }
            }
        });

        enviarOitavas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(C1.getText() != "1C" && D2.getText() != "2D") {

                    try {

                        if (Integer.parseInt(Gols1Oitavas2.getText()) == Integer.parseInt(Gols2Oitavas2.getText())) {

                            Penaltis1Oitavas2.setEditable(true);

                            Penaltis2Oitavas2.setEditable(true);

                            Gols1Oitavas2.setEditable(false);

                            Gols2Oitavas2.setEditable(false);

                            if (Integer.parseInt(Penaltis1Oitavas2.getText()) > Integer.parseInt(Penaltis2Oitavas2.getText())) {

                                VencedorOitavas2.setText(C1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas2.getText()) < Integer.parseInt(Penaltis2Oitavas2.getText())) {

                                VencedorOitavas2.setText(D2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas2.getText()) == Integer.parseInt(Penaltis2Oitavas2.getText())) {

                                Penaltis1Oitavas2.setText("");

                                Penaltis2Oitavas2.setText("");

                                Penaltis1Oitavas2.setEditable(false);

                                Penaltis2Oitavas2.setEditable(false);

                                Gols1Oitavas2.setEditable(true);

                                Gols2Oitavas2.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Oitavas2.getText()) > Integer.parseInt(Gols2Oitavas2.getText())) {

                            VencedorOitavas2.setText(C1.getText());

                        } else {

                            VencedorOitavas2.setText(D2.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarOitavas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(E1.getText() != "1E" && F2.getText() != "2F") {

                    try {

                        if (Integer.parseInt(Gols1Oitavas3.getText()) == Integer.parseInt(Gols2Oitavas3.getText())) {

                            Penaltis1Oitavas3.setEditable(true);

                            Penaltis2Oitavas3.setEditable(true);

                            Gols1Oitavas3.setEditable(false);

                            Gols2Oitavas3.setEditable(false);


                            if (Integer.parseInt(Penaltis1Oitavas3.getText()) > Integer.parseInt(Penaltis2Oitavas3.getText())) {

                                VencedorOitavas3.setText(E1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas3.getText()) < Integer.parseInt(Penaltis2Oitavas3.getText())) {

                                VencedorOitavas3.setText(F2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas3.getText()) == Integer.parseInt(Penaltis2Oitavas3.getText())) {

                                Penaltis1Oitavas3.setText("");

                                Penaltis2Oitavas3.setText("");

                                Penaltis1Oitavas3.setEditable(false);

                                Penaltis2Oitavas3.setEditable(false);

                                Gols1Oitavas3.setEditable(true);

                                Gols2Oitavas3.setEditable(true);

                            }


                        } else if (Integer.parseInt(Gols1Oitavas3.getText()) > Integer.parseInt(Gols2Oitavas3.getText())) {

                            VencedorOitavas3.setText(E1.getText());

                        } else {

                            VencedorOitavas3.setText(F2.getText());

                        }
                    }

                    catch (Exception exception){

                    }

                }
            }
        });

        enviarOitavas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(G1.getText() != "1G" && H2.getText() != "2H") {

                    try {

                        if (Integer.parseInt(Gols1Oitavas4.getText()) == Integer.parseInt(Gols2Oitavas4.getText())) {

                            Penaltis1Oitavas4.setEditable(true);

                            Penaltis2Oitavas4.setEditable(true);

                            Gols1Oitavas4.setEditable(false);

                            Gols2Oitavas4.setEditable(false);

                            if (Integer.parseInt(Penaltis1Oitavas4.getText()) > Integer.parseInt(Penaltis2Oitavas4.getText())) {

                                VencedorOitavas4.setText(G1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas4.getText()) < Integer.parseInt(Penaltis2Oitavas4.getText())) {

                                VencedorOitavas4.setText(H2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas4.getText()) == Integer.parseInt(Penaltis2Oitavas4.getText())) {

                                Penaltis1Oitavas4.setText("");

                                Penaltis2Oitavas4.setText("");

                                Penaltis1Oitavas4.setEditable(false);

                                Penaltis2Oitavas4.setEditable(false);

                                Gols1Oitavas4.setEditable(true);

                                Gols2Oitavas4.setEditable(true);

                            }


                        } else if (Integer.parseInt(Gols1Oitavas4.getText()) > Integer.parseInt(Gols2Oitavas4.getText())) {

                            VencedorOitavas4.setText(G1.getText());

                        } else {

                            VencedorOitavas4.setText(H2.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarOitavas5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(B1.getText() != "1B" && A2.getText() != "2A") {

                    try {

                        if (Integer.parseInt(Gols1Oitavas5.getText()) == Integer.parseInt(Gols2Oitavas5.getText())) {

                            Penaltis1Oitavas5.setEditable(true);

                            Penaltis2Oitavas5.setEditable(true);

                            Gols1Oitavas5.setEditable(false);

                            Gols2Oitavas5.setEditable(false);

                            if (Integer.parseInt(Penaltis1Oitavas5.getText()) > Integer.parseInt(Penaltis2Oitavas5.getText())) {

                                VencedorOitavas1.setText(B1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas5.getText()) < Integer.parseInt(Penaltis2Oitavas5.getText())) {

                                VencedorOitavas5.setText(A2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas5.getText()) == Integer.parseInt(Penaltis2Oitavas5.getText())) {

                                Penaltis1Oitavas5.setText("");

                                Penaltis2Oitavas5.setText("");

                                Penaltis1Oitavas5.setEditable(false);

                                Penaltis2Oitavas5.setEditable(false);

                                Gols1Oitavas5.setEditable(true);

                                Gols2Oitavas5.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Oitavas5.getText()) > Integer.parseInt(Gols2Oitavas5.getText())) {

                            VencedorOitavas5.setText(B1.getText());

                        } else {

                            VencedorOitavas5.setText(A2.getText());

                        }
                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarOitavas6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(D1.getText() != "1D" && C2.getText() != "2C") {

                    try {

                        if (Integer.parseInt(Gols1Oitavas6.getText()) == Integer.parseInt(Gols2Oitavas6.getText())) {

                            Penaltis1Oitavas6.setEditable(true);

                            Penaltis2Oitavas6.setEditable(true);

                            Gols1Oitavas6.setEditable(false);

                            Gols2Oitavas6.setEditable(false);

                            if (Integer.parseInt(Penaltis1Oitavas6.getText()) > Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                VencedorOitavas6.setText(D1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas6.getText()) < Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                VencedorOitavas6.setText(C2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas6.getText()) == Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                Penaltis1Oitavas6.setText("");

                                Penaltis2Oitavas6.setText("");

                                Penaltis1Oitavas6.setEditable(false);

                                Penaltis2Oitavas6.setEditable(false);

                                Gols1Oitavas6.setEditable(true);

                                Gols2Oitavas6.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Oitavas6.getText()) > Integer.parseInt(Gols2Oitavas6.getText())) {

                            VencedorOitavas6.setText(D1.getText());

                        } else {

                            VencedorOitavas6.setText(C2.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarOitavas7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(F1.getText() != "1F" && E2.getText() != "2E") {

                    try {

                        if (Integer.parseInt(Gols1Oitavas7.getText()) == Integer.parseInt(Gols2Oitavas7.getText())) {

                            Penaltis1Oitavas7.setEditable(true);

                            Penaltis2Oitavas7.setEditable(true);

                            Gols1Oitavas7.setEditable(false);

                            Gols2Oitavas7.setEditable(false);

                            if (Integer.parseInt(Penaltis1Oitavas7.getText()) > Integer.parseInt(Penaltis2Oitavas7.getText())) {

                                VencedorOitavas7.setText(F1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas7.getText()) < Integer.parseInt(Penaltis2Oitavas7.getText())) {

                                VencedorOitavas7.setText(E2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas6.getText()) == Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                Penaltis1Oitavas7.setText("");

                                Penaltis2Oitavas7.setText("");

                                Penaltis1Oitavas7.setEditable(false);

                                Penaltis2Oitavas7.setEditable(false);

                                Gols1Oitavas7.setEditable(true);

                                Gols2Oitavas7.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Oitavas7.getText()) > Integer.parseInt(Gols2Oitavas7.getText())) {

                            VencedorOitavas7.setText(F1.getText());

                        } else {

                            VencedorOitavas7.setText(E2.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarOitavas8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(H1.getText() != "1H" && G2.getText() != "2G") {

                    try {

                        if (Integer.parseInt(Gols1Oitavas8.getText()) == Integer.parseInt(Gols2Oitavas8.getText())) {

                            Penaltis1Oitavas8.setEditable(true);

                            Penaltis2Oitavas8.setEditable(true);

                            Gols1Oitavas8.setEditable(false);

                            Gols2Oitavas8.setEditable(false);

                            if (Integer.parseInt(Penaltis1Oitavas8.getText()) > Integer.parseInt(Penaltis2Oitavas8.getText())) {

                                VencedorOitavas8.setText(H1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas8.getText()) < Integer.parseInt(Penaltis2Oitavas8.getText())) {

                                VencedorOitavas8.setText(G2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Oitavas6.getText()) == Integer.parseInt(Penaltis2Oitavas6.getText())) {

                                Penaltis1Oitavas8.setText("");

                                Penaltis2Oitavas8.setText("");

                                Penaltis1Oitavas8.setEditable(false);

                                Penaltis2Oitavas8.setEditable(false);

                                Gols1Oitavas8.setEditable(true);

                                Gols2Oitavas8.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Oitavas8.getText()) > Integer.parseInt(Gols2Oitavas8.getText())) {

                            VencedorOitavas8.setText(H1.getText());

                        } else {

                            VencedorOitavas8.setText(G2.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarQuartas1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(VencedorOitavas1.getText() != "A definir" && VencedorOitavas2.getText() != "A definir") {

                    try {

                        if (Integer.parseInt(Gols1Quartas1.getText()) == Integer.parseInt(Gols2Quartas1.getText())) {

                            Penaltis1Quartas1.setEditable(true);

                            Penaltis2Quartas1.setEditable(true);

                            Gols1Quartas1.setEditable(false);

                            Gols2Quartas1.setEditable(false);

                            if (Integer.parseInt(Penaltis1Quartas1.getText()) > Integer.parseInt(Penaltis2Quartas1.getText())) {

                                VencedorQuartas1.setText(VencedorOitavas1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Quartas1.getText()) < Integer.parseInt(Penaltis2Quartas1.getText())) {

                                VencedorQuartas1.setText(VencedorOitavas2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Quartas1.getText()) == Integer.parseInt(Penaltis2Quartas1.getText())) {

                                Penaltis1Quartas1.setText("");

                                Penaltis2Quartas1.setText("");

                                Penaltis1Quartas1.setEditable(false);

                                Penaltis2Quartas1.setEditable(false);

                                Gols1Quartas1.setEditable(true);

                                Gols2Quartas1.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Quartas1.getText()) > Integer.parseInt(Gols2Quartas1.getText())) {

                            VencedorQuartas1.setText(VencedorOitavas1.getText());

                        } else {

                            VencedorQuartas1.setText(VencedorOitavas2.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarQuartas2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(VencedorOitavas3.getText() != "A definir" && VencedorOitavas4.getText() != "A definir") {

                    try {

                        if (Integer.parseInt(Gols1Quartas2.getText()) == Integer.parseInt(Gols2Quartas2.getText())) {

                            Penaltis1Quartas2.setEditable(true);

                            Penaltis2Quartas2.setEditable(true);

                            Gols1Quartas2.setEditable(false);

                            Gols2Quartas2.setEditable(false);

                            if (Integer.parseInt(Penaltis1Quartas2.getText()) > Integer.parseInt(Penaltis2Quartas2.getText())) {

                                VencedorQuartas2.setText(VencedorOitavas3.getText());

                            }

                            if (Integer.parseInt(Penaltis1Quartas2.getText()) < Integer.parseInt(Penaltis2Quartas2.getText())) {

                                VencedorQuartas2.setText(VencedorOitavas4.getText());

                            }

                            if (Integer.parseInt(Penaltis1Quartas2.getText()) == Integer.parseInt(Penaltis2Quartas2.getText())) {

                                Penaltis1Quartas2.setText("");

                                Penaltis2Quartas2.setText("");

                                Penaltis1Quartas2.setEditable(false);

                                Penaltis2Quartas2.setEditable(false);

                                Gols1Quartas2.setEditable(true);

                                Gols2Quartas2.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Quartas2.getText()) > Integer.parseInt(Gols2Quartas2.getText())) {

                            VencedorQuartas2.setText(VencedorOitavas3.getText());

                        } else {

                            VencedorQuartas2.setText(VencedorOitavas4.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarQuartas3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(VencedorOitavas5.getText() != "A definir" && VencedorOitavas6.getText() != "A definir") {

                    try {

                        if (Integer.parseInt(Gols1Quartas3.getText()) == Integer.parseInt(Gols2Quartas3.getText())) {

                            Penaltis1Quartas3.setEditable(true);

                            Penaltis2Quartas3.setEditable(true);

                            Gols1Quartas3.setEditable(false);

                            Gols2Quartas3.setEditable(false);

                            if (Integer.parseInt(Penaltis1Quartas3.getText()) > Integer.parseInt(Penaltis2Quartas3.getText())) {

                                VencedorQuartas3.setText(VencedorOitavas5.getText());

                            }

                            if (Integer.parseInt(Penaltis1Quartas3.getText()) < Integer.parseInt(Penaltis2Quartas3.getText())) {

                                VencedorQuartas3.setText(VencedorOitavas6.getText());

                            }

                            if (Integer.parseInt(Penaltis1Quartas3.getText()) == Integer.parseInt(Penaltis2Quartas3.getText())) {

                                Penaltis1Quartas3.setText("");

                                Penaltis2Quartas3.setText("");

                                Penaltis1Quartas3.setEditable(false);

                                Penaltis2Quartas3.setEditable(false);

                                Gols1Quartas3.setEditable(true);

                                Gols2Quartas3.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Quartas3.getText()) > Integer.parseInt(Gols2Quartas3.getText())) {

                            VencedorQuartas3.setText(VencedorOitavas5.getText());

                        } else {

                            VencedorQuartas3.setText(VencedorOitavas6.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarQuartas4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(VencedorOitavas7.getText() != "A definir" && VencedorOitavas8.getText() != "A definir") {

                    try {

                        if (Integer.parseInt(Gols1Quartas4.getText()) == Integer.parseInt(Gols2Quartas4.getText())) {

                            Penaltis1Quartas4.setEditable(true);

                            Penaltis2Quartas4.setEditable(true);

                            Gols1Quartas4.setEditable(false);

                            Gols2Quartas4.setEditable(false);

                            if (Integer.parseInt(Penaltis1Quartas4.getText()) > Integer.parseInt(Penaltis2Quartas4.getText())) {

                                VencedorQuartas4.setText(VencedorOitavas7.getText());

                            }

                            if (Integer.parseInt(Penaltis1Quartas4.getText()) < Integer.parseInt(Penaltis2Quartas4.getText())) {

                                VencedorQuartas4.setText(VencedorOitavas8.getText());

                            }

                            if (Integer.parseInt(Penaltis1Quartas4.getText()) == Integer.parseInt(Penaltis2Quartas4.getText())) {

                                Penaltis1Quartas4.setText("");

                                Penaltis2Quartas4.setText("");

                                Penaltis1Quartas4.setEditable(false);

                                Penaltis2Quartas4.setEditable(false);

                                Gols1Quartas4.setEditable(true);

                                Gols2Quartas4.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Quartas4.getText()) > Integer.parseInt(Gols2Quartas4.getText())) {

                            VencedorQuartas4.setText(VencedorOitavas7.getText());

                        } else {

                            VencedorQuartas4.setText(VencedorOitavas8.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarSemi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(VencedorQuartas1.getText() != "A definir" && VencedorQuartas2.getText() != "A definir") {

                    try {

                        if (Integer.parseInt(Gols1Semi1.getText()) == Integer.parseInt(Gols2Semi1.getText())) {

                            Penaltis1Semi1.setEditable(true);

                            Penaltis2Semi1.setEditable(true);

                            Gols1Semi1.setEditable(false);

                            Gols2Semi1.setEditable(false);

                            if (Integer.parseInt(Penaltis1Semi1.getText()) > Integer.parseInt(Penaltis2Semi1.getText())) {

                                VencedorSemi1.setText(VencedorQuartas1.getText());

                                PerderdorSemi1.setText(VencedorQuartas2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Semi1.getText()) < Integer.parseInt(Penaltis2Semi1.getText())) {

                                VencedorSemi1.setText(VencedorQuartas2.getText());

                                PerderdorSemi1.setText(VencedorQuartas1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Semi1.getText()) == Integer.parseInt(Penaltis2Semi1.getText())) {

                                Penaltis1Semi1.setText("");

                                Penaltis2Semi1.setText("");

                                Penaltis1Semi1.setEditable(false);

                                Penaltis2Semi1.setEditable(false);

                                Gols1Semi1.setEditable(true);

                                Gols2Semi1.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Semi1.getText()) > Integer.parseInt(Gols2Semi1.getText())) {

                            VencedorSemi1.setText(VencedorQuartas1.getText());

                            PerderdorSemi1.setText(VencedorQuartas2.getText());

                        } else {

                            VencedorSemi1.setText(VencedorQuartas2.getText());

                            PerderdorSemi1.setText(VencedorQuartas1.getText());

                        }
                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarSemi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(VencedorQuartas3.getText() != "A definir" && VencedorQuartas4.getText() != "A definir") {

                    try {

                        if (Integer.parseInt(Gols1Semi2.getText()) == Integer.parseInt(Gols2Semi2.getText())) {

                            Penaltis1Semi2.setEditable(true);

                            Penaltis2Semi2.setEditable(true);

                            Gols1Semi2.setEditable(false);

                            Gols2Semi2.setEditable(false);

                            if (Integer.parseInt(Penaltis1Semi2.getText()) > Integer.parseInt(Penaltis2Semi2.getText())) {

                                VencedorSemi2.setText(VencedorQuartas3.getText());

                                PerderdorSemi2.setText(VencedorQuartas4.getText());

                            }

                            if (Integer.parseInt(Penaltis1Semi2.getText()) < Integer.parseInt(Penaltis2Semi2.getText())) {

                                VencedorSemi2.setText(VencedorQuartas4.getText());

                                PerderdorSemi2.setText(VencedorQuartas3.getText());

                            }

                            if (Integer.parseInt(Penaltis1Semi2.getText()) == Integer.parseInt(Penaltis2Semi2.getText())) {

                                Penaltis1Semi2.setText("");

                                Penaltis2Semi2.setText("");

                                Penaltis1Semi2.setEditable(false);

                                Penaltis2Semi2.setEditable(false);

                                Gols1Semi2.setEditable(true);

                                Gols2Semi2.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Semi2.getText()) > Integer.parseInt(Gols2Semi2.getText())) {

                            VencedorSemi2.setText(VencedorQuartas3.getText());

                            PerderdorSemi2.setText(VencedorQuartas4.getText());

                        } else {

                            VencedorSemi2.setText(VencedorQuartas4.getText());

                            PerderdorSemi2.setText(VencedorQuartas3.getText());

                        }
                    }

                    catch (Exception exception){

                    }

                }

            }
        });

        enviarFinal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(VencedorSemi1.getText() != "A definir" && VencedorSemi2.getText() != "A definir") {

                    try {

                        if (Integer.parseInt(Gols1Final.getText()) == Integer.parseInt(Gols2Final.getText())) {

                            Penaltis1Final.setEditable(true);

                            Penaltis2Final.setEditable(true);

                            Gols1Final.setEditable(false);

                            Gols2Final.setEditable(false);

                            if (Integer.parseInt(Penaltis1Final.getText()) > Integer.parseInt(Penaltis2Final.getText())) {

                                VencedorFinal.setText(VencedorSemi1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Final.getText()) < Integer.parseInt(Penaltis2Final.getText())) {

                                VencedorFinal.setText(VencedorSemi2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Final.getText()) == Integer.parseInt(Penaltis2Final.getText())) {

                                Penaltis1Final.setText("");

                                Penaltis2Final.setText("");

                                Penaltis1Final.setEditable(false);

                                Penaltis2Final.setEditable(false);

                                Gols1Final.setEditable(true);

                                Gols2Final.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Final.getText()) > Integer.parseInt(Gols2Final.getText())) {

                            VencedorFinal.setText(VencedorSemi1.getText());

                        } else {

                            VencedorFinal.setText(VencedorSemi2.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });
        enviarTerceira.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(PerderdorSemi1.getText() != "A definir" && PerderdorSemi2.getText() != "A definir") {

                    try {

                        if (Integer.parseInt(Gols1Terceiro.getText()) == Integer.parseInt(Gols2Terceiro.getText())) {

                            Penaltis1Terceiro.setEditable(true);

                            Penaltis2Terceiro.setEditable(true);

                            Gols1Terceiro.setEditable(false);

                            Gols2Terceiro.setEditable(false);

                            if (Integer.parseInt(Penaltis1Terceiro.getText()) > Integer.parseInt(Penaltis2Terceiro.getText())) {

                                VencedorTerceiro.setText(PerderdorSemi1.getText());

                            }

                            if (Integer.parseInt(Penaltis1Terceiro.getText()) < Integer.parseInt(Penaltis2Terceiro.getText())) {

                                VencedorTerceiro.setText(PerderdorSemi2.getText());

                            }

                            if (Integer.parseInt(Penaltis1Terceiro.getText()) == Integer.parseInt(Penaltis2Terceiro.getText())) {

                                Penaltis1Terceiro.setText("");

                                Penaltis2Terceiro.setText("");

                                Penaltis1Terceiro.setEditable(false);

                                Penaltis2Terceiro.setEditable(false);

                                Gols1Terceiro.setEditable(true);

                                Gols2Terceiro.setEditable(true);

                            }

                        } else if (Integer.parseInt(Gols1Terceiro.getText()) > Integer.parseInt(Gols2Terceiro.getText())) {

                            VencedorTerceiro.setText(PerderdorSemi1.getText());

                        } else {

                            VencedorTerceiro.setText(PerderdorSemi2.getText());

                        }

                    }

                    catch (Exception exception){

                    }

                }

            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabela");

        frame.setContentPane(new Tabela().TabbedPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(1920, 1080);

        frame.setVisible(true);

        Tabela tabela = new Tabela();

    }

}
