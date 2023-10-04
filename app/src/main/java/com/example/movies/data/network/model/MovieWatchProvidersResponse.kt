package com.example.movies.data.network.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MovieWatchProvidersResponse(
    @SerialName("id")
    val id: Int?,
    @SerialName("results")
    val results: Results?
) {
    @Serializable
    data class Results(
        @SerialName("AD")
        val aD: AD?,
        @SerialName("AE")
        val aE: AE?,
        @SerialName("AG")
        val aG: AG?,
        @SerialName("AL")
        val aL: AL?,
        @SerialName("AR")
        val aR: AR?,
        @SerialName("AT")
        val aT: AT?,
        @SerialName("AU")
        val aU: AU?,
        @SerialName("BA")
        val bA: BA?,
        @SerialName("BB")
        val bB: BB?,
        @SerialName("BE")
        val bE: BE?,
        @SerialName("BG")
        val bG: BG?,
        @SerialName("BH")
        val bH: BH?,
        @SerialName("BM")
        val bM: BM?,
        @SerialName("BO")
        val bO: BO?,
        @SerialName("BR")
        val bR: BR?,
        @SerialName("BS")
        val bS: BS?,
        @SerialName("CA")
        val cA: CA?,
        @SerialName("CH")
        val cH: CH?,
        @SerialName("CL")
        val cL: CL?,
        @SerialName("CO")
        val cO: CO?,
        @SerialName("CR")
        val cR: CR?,
        @SerialName("CZ")
        val cZ: CZ?,
        @SerialName("DE")
        val dE: DE?,
        @SerialName("DK")
        val dK: DK?,
        @SerialName("DO")
        val dO: DO?,
        @SerialName("DZ")
        val dZ: DZ?,
        @SerialName("EC")
        val eC: EC?,
        @SerialName("EE")
        val eE: EE?,
        @SerialName("EG")
        val eG: EG?,
        @SerialName("ES")
        val eS: ES?,
        @SerialName("FI")
        val fI: FI?,
        @SerialName("FR")
        val fR: FR?,
        @SerialName("GB")
        val gB: GB?,
        @SerialName("GF")
        val gF: GF?,
        @SerialName("GI")
        val gI: GI?,
        @SerialName("GR")
        val gR: GR?,
        @SerialName("GT")
        val gT: GT?,
        @SerialName("HK")
        val hK: HK?,
        @SerialName("HN")
        val hN: HN?,
        @SerialName("HR")
        val hR: HR?,
        @SerialName("HU")
        val hU: HU?,
        @SerialName("ID")
        val iD: ID?,
        @SerialName("IE")
        val iE: IE?,
        @SerialName("IL")
        val iL: IL?,
        @SerialName("IN")
        val iN: IN?,
        @SerialName("IQ")
        val iQ: IQ?,
        @SerialName("IS")
        val iS: IS?,
        @SerialName("IT")
        val iT: IT?,
        @SerialName("JM")
        val jM: JM?,
        @SerialName("JO")
        val jO: JO?,
        @SerialName("JP")
        val jP: JP?,
        @SerialName("KR")
        val kR: KR?,
        @SerialName("KW")
        val kW: KW?,
        @SerialName("LB")
        val lB: LB?,
        @SerialName("LC")
        val lC: LC?,
        @SerialName("LI")
        val lI: LI?,
        @SerialName("LT")
        val lT: LT?,
        @SerialName("LV")
        val lV: LV?,
        @SerialName("LY")
        val lY: LY?,
        @SerialName("MA")
        val mA: MA?,
        @SerialName("MC")
        val mC: MC?,
        @SerialName("MD")
        val mD: MD?,
        @SerialName("MK")
        val mK: MK?,
        @SerialName("MT")
        val mT: MT?,
        @SerialName("MX")
        val mX: MX?,
        @SerialName("MY")
        val mY: MY?,
        @SerialName("NI")
        val nI: NI?,
        @SerialName("NL")
        val nL: NL?,
        @SerialName("NO")
        val nO: NO?,
        @SerialName("NZ")
        val nZ: NZ?,
        @SerialName("OM")
        val oM: OM?,
        @SerialName("PA")
        val pA: PA?,
        @SerialName("PE")
        val pE: PE?,
        @SerialName("PF")
        val pF: PF?,
        @SerialName("PH")
        val pH: PH?,
        @SerialName("PK")
        val pK: PK?,
        @SerialName("PL")
        val pL: PL?,
        @SerialName("PS")
        val pS: PS?,
        @SerialName("PT")
        val pT: PT?,
        @SerialName("PY")
        val pY: PY?,
        @SerialName("QA")
        val qA: QA?,
        @SerialName("RO")
        val rO: RO?,
        @SerialName("RS")
        val rS: RS?,
        @SerialName("SA")
        val sA: SA?,
        @SerialName("SE")
        val sE: SE?,
        @SerialName("SG")
        val sG: SG?,
        @SerialName("SI")
        val sI: SI?,
        @SerialName("SK")
        val sK: SK?,
        @SerialName("SM")
        val sM: SM?,
        @SerialName("SV")
        val sV: SV?,
        @SerialName("TC")
        val tC: TC?,
        @SerialName("TH")
        val tH: TH?,
        @SerialName("TN")
        val tN: TN?,
        @SerialName("TR")
        val tR: TR?,
        @SerialName("TT")
        val tT: TT?,
        @SerialName("TW")
        val tW: TW?,
        @SerialName("US")
        val uS: US?,
        @SerialName("UY")
        val uY: UY?,
        @SerialName("VE")
        val vE: VE?,
        @SerialName("YE")
        val yE: YE?,
        @SerialName("ZA")
        val zA: ZA?
    ) {
        @Serializable
        data class AD(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class AE(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class AG(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class AL(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class AR(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class AT(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class AU(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class BA(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class BB(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class BE(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class BG(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class BH(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class BM(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class BO(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class BR(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class BS(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class CA(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class CH(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class CL(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class CO(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class CR(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class CZ(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class DE(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class DK(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class DO(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class DZ(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class EC(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class EE(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class EG(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class ES(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class FI(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class FR(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class GB(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class GF(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class GI(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class GR(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class GT(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class HK(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class HN(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class HR(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class HU(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class ID(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class IE(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class IL(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class IN(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class IQ(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class IS(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class IT(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class JM(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class JO(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class JP(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class KR(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class KW(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class LB(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class LC(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class LI(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class LT(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class LV(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class LY(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class MA(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class MC(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class MD(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class MK(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class MT(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class MX(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class MY(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class NI(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class NL(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class NO(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class NZ(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class OM(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class PA(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class PE(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class PF(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class PH(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class PK(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class PL(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class PS(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class PT(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class PY(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class QA(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class RO(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class RS(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class SA(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class SE(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class SG(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class SI(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class SK(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class SM(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class SV(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class TC(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class TH(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class TN(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class TR(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class TT(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class TW(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class US(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class UY(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class VE(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class YE(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }

        @Serializable
        data class ZA(
            @SerialName("flatrate")
            val flatrate: List<Flatrate?>?,
            @SerialName("link")
            val link: String?
        ) {
            @Serializable
            data class Flatrate(
                @SerialName("display_priority")
                val displayPriority: Int?,
                @SerialName("logo_path")
                val logoPath: String?,
                @SerialName("provider_id")
                val providerId: Int?,
                @SerialName("provider_name")
                val providerName: String?
            )
        }
    }
}