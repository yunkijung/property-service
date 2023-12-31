package com.loglrs.propertyservice.domain.house.repository;


import com.loglrs.propertyservice.domain.house.entity.House;
import com.loglrs.propertyservice.domain.house.entity.QHouse;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
@RequiredArgsConstructor
public class HouseRepositoryImpl implements HouseRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<House> search(Double lng, Double lat, Double distance) {

        log.info("data : {}, {}, {}", lng, lat, distance);
        QHouse houseSub = new QHouse("houseSub");
//        StringTemplate template = Expressions.stringTemplate(
//                "ST_Distance_Sphere(ST_GeomFromText(house.point), ST_GeomFromText(CONCAT('POINT(', {0}, ' ', {1}, ')'), 4326))", lng, lat
//        );

        StringTemplate template = Expressions.stringTemplate(
                "ST_Distance_Sphere(ST_GeomFromText(house.point), ST_GeomFromText(CONCAT('POINT(', {0}, ' ', {1}, ')'), 4326))", lng, lat
        );
//
//        return queryFactory
//                .select(house)
//                .from(house)
//                .where(
//                        Expressions.stringTemplate(
//                                "ST_Distance_Sphere(?0, ?1) <= ?2"
//                                , house.point
//                                , Expressions.stringTemplate("ST_GeomFromText(?0, 4326)"
//                                , Expressions.stringTemplate("POINT(?0, ?1)", lat, lng)
//                                        )
//                                , distance
//                        ).equalsIgnoreCase("true")
//                )
//                .fetch();


//        return queryFactory
//                .select(house)
//                .from(house)
//                .where(
//                        Expressions.stringTemplate(
//                                "ST_Distance_Sphere(ST_GeomFromText(house.point), ST_GeomFromText(CONCAT('POINT(', {0}, ' ', {1}, ')'), 4326)) <= {2}",
//                                lng, lat, distance
//                        ).equalsIgnoreCase("true")
//                )
//                .fetch();

//        return queryFactory
//                .select(house)
//                .from(house)
//                .where(
//                        Expressions.stringTemplate(
//                                "ST_Distance_Sphere(ST_GeomFromText({0}), ST_GeomFromText(CONCAT('POINT(', {1}, ' ', {2}, ')'), 4326)) <= {3}",
//                                house.point, lng, lat, distance
//                        ).equalsIgnoreCase("true")
//                )
//                .fetch();

//        BooleanBuilder builder = new BooleanBuilder();
//        builder.and(house.point.distanceSphere(
//                Expressions.constant(
//                        new WKTWriter().write(new GeometryFactory().createPoint(new Coordinate(lng, lat)))
//                )
//        ).loe(distance));

//        String queryString = Expressions.stringTemplate(
//                "ST_Distance_Sphere(ST_GeomFromText(house.point), ST_GeomFromText(CONCAT('POINT(', {0}, ' ', {1}, ')'), 4326)) <= {2}",
//                lng, lat, distance
//        ).toString();
//
//        log.info("Test@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ {}", queryString);
        return queryFactory
                .selectFrom(QHouse.house)
                .where(

                )
                .fetch();

    }
}
