package top.yangwulang.platform.entity.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.babyfish.jimmer.ImmutableObjects;
import org.babyfish.jimmer.View;
import org.babyfish.jimmer.impl.util.DtoPropAccessor;
import org.babyfish.jimmer.internal.GeneratedBy;
import org.babyfish.jimmer.meta.PropId;
import org.babyfish.jimmer.runtime.ImmutableSpi;
import org.babyfish.jimmer.sql.fetcher.DtoMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.yangwulang.platform.entity.sys.*;

/**
 * 公司
 *
 * @author yangwulang
 */
@GeneratedBy(
        file = "<free-platform-framework-api>/src/main/dto/top/yangwulang/platform/entity/sys/Company.dto"
)
public class CompanyListView implements View<Company> {
    public static final DtoMetadata<Company, CompanyListView> METADATA =
            new DtoMetadata<Company, CompanyListView>(
                    CompanyFetcher.$
                            .companyCode()
                            .companyName()
                            .companyFullName()
                            .corpCode()
                            .corpName()
                            .recursiveChildren(it -> it.recursive(
                                    args -> ImmutableObjects.isLoaded(args.getEntity(), CompanyProps.CHILDREN) &&
                                            !args.getEntity().children().isEmpty()
                            )),
                    CompanyListView::new
            );

    private static final DtoPropAccessor CHILDREN_ACCESSOR = new DtoPropAccessor(
            false,
            new int[]{CompanyDraft.Producer.SLOT_CHILDREN},
            DtoPropAccessor.<Company, CompanyListView>objectListGetter(CompanyListView::new),
            DtoPropAccessor.objectListSetter(CompanyListView::toEntity)
    );

    @NotNull
    private String id;

    @Schema(
            description = "公司编码"
    )
    @NotNull
    private String companyCode;

    @Schema(
            description = "公司名称"
    )
    @NotNull
    private String companyName;

    @Schema(
            description = "公司全名"
    )
    @Nullable
    private String companyFullName;

    @Nullable
    private String corpCode;

    @Nullable
    private String corpName;

    @Schema(
            description = "子级公司"
    )
    @Nullable
    private List<CompanyListView> children;

    public CompanyListView() {
    }

    public CompanyListView(@NotNull Company base) {
        this.id = base.id();
        this.companyCode = base.companyCode();
        this.companyName = base.companyName();
        this.companyFullName = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_COMPANY_FULL_NAME)) ? base.companyFullName() : null;
        this.corpCode = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_CORP_CODE)) ? base.corpCode() : null;
        this.corpName = ((ImmutableSpi) base).__isLoaded(PropId.byIndex(CompanyDraft.Producer.SLOT_CORP_NAME)) ? base.corpName() : null;
        this.children = CHILDREN_ACCESSOR.get(base);
    }

    public static CompanyListView of(@NotNull Company base) {
        return new CompanyListView(base);
    }

    /**
     * 字典类型编码
     *
     * @return 主键值
     */
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(@NotNull String id) {
        this.id = id;
    }

    /**
     * 公司编码
     */
    @NotNull
    @Schema(
            description = "公司编码"
    )
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(@NotNull String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * 公司名称
     */
    @NotNull
    @Schema(
            description = "公司名称"
    )
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(@NotNull String companyName) {
        this.companyName = companyName;
    }

    /**
     * 公司全名
     */
    @Nullable
    @Schema(
            description = "公司全名"
    )
    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(@Nullable String companyFullName) {
        this.companyFullName = companyFullName;
    }

    @Nullable
    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(@Nullable String corpCode) {
        this.corpCode = corpCode;
    }

    @Nullable
    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(@Nullable String corpName) {
        this.corpName = corpName;
    }

    /**
     * 子级公司
     *
     * @return 子级公司
     */
    @Nullable
    @Schema(
            description = "子级公司"
    )
    public List<CompanyListView> getChildren() {
        return children;
    }

    public void setChildren(@Nullable List<CompanyListView> children) {
        this.children = children;
    }

    @Override
    public Company toEntity() {
        return CompanyDraft.$.produce(__draft -> {
            __draft.setId(id);
            __draft.setCompanyCode(companyCode);
            __draft.setCompanyName(companyName);
            __draft.setCompanyFullName(companyFullName);
            __draft.setCorpCode(corpCode);
            __draft.setCorpName(corpName);
            CHILDREN_ACCESSOR.set(__draft, children != null ? children : Collections.emptyList());
        });
    }

    @Override
    public int hashCode() {
        int hash = Objects.hashCode(id);
        hash = hash * 31 + Objects.hashCode(companyCode);
        hash = hash * 31 + Objects.hashCode(companyName);
        hash = hash * 31 + Objects.hashCode(companyFullName);
        hash = hash * 31 + Objects.hashCode(corpCode);
        hash = hash * 31 + Objects.hashCode(corpName);
        hash = hash * 31 + Objects.hashCode(children);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        CompanyListView other = (CompanyListView) o;
        if (!Objects.equals(id, other.id)) {
            return false;
        }
        if (!Objects.equals(companyCode, other.companyCode)) {
            return false;
        }
        if (!Objects.equals(companyName, other.companyName)) {
            return false;
        }
        if (!Objects.equals(companyFullName, other.companyFullName)) {
            return false;
        }
        if (!Objects.equals(corpCode, other.corpCode)) {
            return false;
        }
        if (!Objects.equals(corpName, other.corpName)) {
            return false;
        }
        if (!Objects.equals(children, other.children)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CompanyListView").append('(');
        builder.append("id=").append(id);
        builder.append(", companyCode=").append(companyCode);
        builder.append(", companyName=").append(companyName);
        builder.append(", companyFullName=").append(companyFullName);
        builder.append(", corpCode=").append(corpCode);
        builder.append(", corpName=").append(corpName);
        builder.append(", children=").append(children);
        builder.append(')');
        return builder.toString();
    }
}
